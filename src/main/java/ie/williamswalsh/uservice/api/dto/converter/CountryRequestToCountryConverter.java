package ie.williamswalsh.uservice.api.dto.converter;

import ie.williamswalsh.uservice.api.dto.CountryDto;
import ie.williamswalsh.uservice.api.dto.request.CountryRequest;
import ie.williamswalsh.uservice.domain.Country;
import lombok.RequiredArgsConstructor;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@Component
@RequiredArgsConstructor
public class CountryRequestToCountryConverter extends AbstractConverter<CountryRequest, Country> {

    @Override
    public Country convert(@Valid final CountryRequest countryRequest) {
        Country country = new Country();
        country.setName(countryRequest.getName());
        country.setCode(countryRequest.getCode());
        return country;
    }
}

