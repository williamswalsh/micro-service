package ie.williamswalsh.uservice.api.dto.converter;

import ie.williamswalsh.uservice.api.dto.CountryDto;
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
public class CountryToCountryDtoConverter extends AbstractConverter<Country, CountryDto> {

    @Override
    public CountryDto convert(@Valid final Country country) {
        CountryDto countryDto = new CountryDto();
        countryDto.setCode(country.getCode());
        countryDto.setName(country.getName());
        return countryDto;
    }
}

