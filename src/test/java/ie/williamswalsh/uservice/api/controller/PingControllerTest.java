package ie.williamswalsh.uservice.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * This will start the Server & Spring application context.
 * The application context will be cached between tests.
 * You won't need to start the application multiple times across multiple test classes.
 *
 * Takes >400ms to run test class.
 *
 * @author William Walsh
 * @version 15 Oct 2022
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PingControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PingController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    void greetingShouldReturnDefaultMessage() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class))
                .isEqualTo("UP");
    }
}
