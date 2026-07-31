package com.sub.nit.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.sub.nit.entity.Student;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
   public  void testSaveStudent() {

        Student s = new Student(1, "Subham", "MCA");

        Student saved = repository.save(s);

        assertNotNull(saved);
        assertEquals("Subham", saved.getName());
    }

    @Test
    public void testFindStudent() {

        repository.save(new Student(1, "Subham", "MCA"));

        Optional<Student> student = repository.findById(1);

        assertTrue(student.isPresent());
    }

    @Test
   public  void testDeleteStudent() {

        repository.save(new Student(1, "Subham", "MCA"));

        repository.deleteById(1);

        assertFalse(repository.findById(1).isPresent());
    }

    @Test
    public void testCount() {

        repository.save(new Student(1, "Subham", "MCA"));
        repository.save(new Student(2, "Rahul", "MBA"));

        assertEquals(2, repository.count());
    }
}
