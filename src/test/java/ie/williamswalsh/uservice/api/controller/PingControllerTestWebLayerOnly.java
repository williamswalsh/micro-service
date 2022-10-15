package ie.williamswalsh.uservice.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * Server is not started.
 * Spring application context is not started.
 * Only the Web layer is started.
 * In an application with multiple controllers, you can even ask for only one to be instantiated by using, for example,
 * by using @WebMvcTest(<Controller>)
 *
 * Takes <400ms to run test class.
 *
 * @author William Walsh
 * @version 15 Oct 2022
 */
@WebMvcTest
class PingControllerTestWebLayerOnly {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnUpMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(content().string("UP"));
    }
}
