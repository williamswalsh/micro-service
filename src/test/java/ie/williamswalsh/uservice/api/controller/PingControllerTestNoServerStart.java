package ie.williamswalsh.uservice.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Spring application context is started but without the server.
 * Takes <400ms to run test class.
 *
 * @author William Walsh
 * @version 15 Oct 2022
 */

@SpringBootTest
@AutoConfigureMockMvc
class PingControllerTestNoServerStart {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnUpMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(content().string("UP"));
    }
}
