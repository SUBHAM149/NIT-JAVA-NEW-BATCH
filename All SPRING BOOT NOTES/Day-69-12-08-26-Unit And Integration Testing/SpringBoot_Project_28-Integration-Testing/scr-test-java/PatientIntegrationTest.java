package com.sub.nit.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class PatientIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    // SAVE PATIENT
    @Test
    void testSavePatient() throws Exception {

        String json = """
                {
                    "name": "Subham",
                    "disease": "Fever",
                    "type": "General"
                }
                """;

        mockMvc.perform(
                post("/patients/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.name").value("Subham"))
        .andExpect(jsonPath("$.disease").value("Fever"))
        .andExpect(jsonPath("$.type").value("General"));
    }

    // GET ALL PATIENTS
    @Test
    void testGetAllPatients() throws Exception {

        mockMvc.perform(get("/patients/all"))
                .andExpect(status().isOk());
    }

    // GET PATIENT BY ID
    @Test
    void testGetPatientById() throws Exception {

        mockMvc.perform(get("/patients/1"))
                .andExpect(status().isOk());
    }
}
