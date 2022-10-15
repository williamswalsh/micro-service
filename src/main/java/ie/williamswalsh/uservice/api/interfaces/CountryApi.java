package ie.williamswalsh.uservice.api.interfaces;

import ie.williamswalsh.uservice.api.dto.CountryDtoList;
import ie.williamswalsh.uservice.api.dto.request.CountryRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

/**
 * @author William Walsh
 * @version 25 Sep 2022
 */
@RequestMapping(value = "/api/v1/country")
public interface CountryApi {

    /**
     * Endpoint to return single country in world.
     */
    // TODO
    // @Operation(summary = "Returns list of all countries")
    // @ApiResponse(responseCode = "200", description = "Successful Response", content = {
    //         @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = InstitutionDto.class)))})
    // @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json"))
    @GetMapping
    CountryDtoList get();

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void create(@RequestBody @Valid final CountryRequest countryRequest);
}



