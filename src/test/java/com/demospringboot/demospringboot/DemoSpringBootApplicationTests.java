package com.demospringboot.demospringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DemoSpringBootApplication.class)
@RunWith(SpringRunner.class)
public class DemoSpringBootApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    public DemoSpringBootApplicationTests(){}
    @Test
    public void testWelcome() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(status().isOk());
    }

    @Test
    public void testHome() throws Exception {
        mockMvc.perform(get("/home")).andExpect(status().isOk());
    }

}
