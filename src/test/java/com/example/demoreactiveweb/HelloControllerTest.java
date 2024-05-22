package com.example.demoreactiveweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@Import(SecurityConfig.class)
@WebMvcTest(value = HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void failingTest() throws Exception {

        mockMvc.perform(get("/test?id=sss")).andExpect(status().isOk()).andReturn().getResponse();
        assertTrue(true);
    }

}
