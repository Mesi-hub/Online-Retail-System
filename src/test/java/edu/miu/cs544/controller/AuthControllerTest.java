package edu.miu.cs544.controller;

import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@SpringBootTest
//@AutoConfigureMockMvc
public class AuthControllerTest {
    //@Autowired
    private MockMvc mockMvc;

    //@Test
    public void shouldReturnDefault() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().is4xxClientError());
    }
}
