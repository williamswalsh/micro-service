package ie.williamswalsh.uservice.api.interfaces;

import ie.williamswalsh.uservice.domain.Country;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@RequestMapping(value = "/")
public interface PingApi {

    /**
     * Endpoint to check if system is available/UP.
     */
    @Operation(summary = "Checks if the web endpoint is available")
    @ApiResponse(responseCode = "200", description = "Successful Response", content = {
            @Content(mediaType = "application/text")})
    @GetMapping
    String get();
}
