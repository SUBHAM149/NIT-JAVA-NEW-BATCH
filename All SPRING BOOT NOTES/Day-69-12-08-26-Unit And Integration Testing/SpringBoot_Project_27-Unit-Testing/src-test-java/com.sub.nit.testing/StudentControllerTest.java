package com.sub.nit.testing;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.sub.nit.testing.controller.StudentController;
import com.sub.nit.testing.entity.Student;
import com.sub.nit.testing.service.StudentService;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private StudentService studentService;


    // SAVE STUDENT
    @Test
    void testSaveStudent() throws Exception {

        Student student = new Student();
        student.setId(1);
        student.setName("Subham");
        student.setCourse("Java");
        student.setMarks(85);

        when(studentService.saveStudent(any(Student.class)))
                .thenReturn(student);

        String json = """
                {
                    "id": 1,
                    "name": "Subham",
                    "course": "Java",
                    "marks": 85
                }
                """;

        mockMvc.perform(
                post("/students/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value(1))
        .andExpect(jsonPath("$.name").value("Subham"))
        .andExpect(jsonPath("$.course").value("Java"))
        .andExpect(jsonPath("$.marks").value(85));
    }


    // GET ALL STUDENTS
    @Test
    void testGetAllStudents() throws Exception {

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Subham");
        s1.setCourse("Java");
        s1.setMarks(85);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Rahul");
        s2.setCourse("Python");
        s2.setMarks(90);

        when(studentService.getAllStudents())
                .thenReturn(Arrays.asList(s1, s2));

        mockMvc.perform(get("/students/all"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2))
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].name").value("Subham"))
                .andExpect(jsonPath("$[1].id").value(2))
                .andExpect(jsonPath("$[1].name").value("Rahul"));
    }


    // GET STUDENT BY ID
    @Test
    void testGetStudentById() throws Exception {

        Student student = new Student();
        student.setId(1);
        student.setName("Subham");
        student.setCourse("Java");
        student.setMarks(85);

        when(studentService.getStudentById(1))
                .thenReturn(student);

        mockMvc.perform(get("/students/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Subham"))
                .andExpect(jsonPath("$.course").value("Java"))
                .andExpect(jsonPath("$.marks").value(85));
    }


    // UPDATE STUDENT
    @Test
    void testUpdateStudent() throws Exception {

        Student student = new Student();

        student.setId(1);
        student.setName("Subham");
        student.setCourse("Spring Boot");
        student.setMarks(95);

        when(studentService.updateStudent(
                any(Integer.class),
                any(Student.class)))
                .thenReturn(student);

        String json = """
                {
                    "id": 1,
                    "name": "Subham",
                    "course": "Spring Boot",
                    "marks": 95
                }
                """;

        mockMvc.perform(
                put("/students/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value(1))
        .andExpect(jsonPath("$.name").value("Subham"))
        .andExpect(jsonPath("$.course").value("Spring Boot"))
        .andExpect(jsonPath("$.marks").value(95));
    }

    // DELETE STUDENT
    @Test
    void testDeleteStudent() throws Exception {

        doNothing()
                .when(studentService)
                .deleteStudent(1);

        mockMvc.perform(delete("/students/1"))
                .andExpect(status().isOk())
                .andExpect(
                        content().string(
                                "Student deleted successfully"
                        )
                );

        verify(studentService)
                .deleteStudent(1);
    }
}
