package ie.williamswalsh.uservice.api.controller;

import ie.williamswalsh.uservice.api.dto.CountryDtoList;
import ie.williamswalsh.uservice.api.dto.request.CountryRequest;
import ie.williamswalsh.uservice.api.interfaces.CountryApi;
import ie.williamswalsh.uservice.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author William Walsh
 * @version 25 Sep 2022
 */
@RestController
@RequiredArgsConstructor
public class CountryController implements CountryApi {

    private final CountryService service;

    @Override
    public CountryDtoList get() {
        return service.list();
    }

    @Override
    public void create(@RequestBody @Valid final CountryRequest countryRequest) {
        service.create(countryRequest);
    }
}
