package ie.williamswalsh.uservice.service;

import ie.williamswalsh.uservice.api.dto.CountryDto;
import ie.williamswalsh.uservice.api.dto.CountryDtoList;
import ie.williamswalsh.uservice.api.dto.request.CountryRequest;
import ie.williamswalsh.uservice.config.converter.ObjectConverter;
import ie.williamswalsh.uservice.domain.Country;
import ie.williamswalsh.uservice.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@Service
@RequiredArgsConstructor
public class DefaultCountryService implements CountryService {

    private final CountryRepository countryRepository;
    private final ObjectConverter objectConverter;

    @Override
    public CountryDtoList list() {
        final List<Country> countries = countryRepository.findAll();
        final List<CountryDto> institutionDtos = objectConverter.convert(countries, CountryDto.class);
        return new CountryDtoList(institutionDtos);
    }

    //
    // @Override
    // public Institution findByExternalId(final String externalId) {
    //     return countryRepository.findByExternalId(externalId)
    //             .orElseThrow(InstitutionNotFoundException::new);
    // }
    //
    @Override
    public void create(@Valid final CountryRequest countryRequest) {
        // checkIfInstitutionPresent(countryRequest.getExternalId());
        final Country country = objectConverter.convert(countryRequest, Country.class);
        countryRepository.save(country);
    }
    //
    // private void checkIfInstitutionPresent(final String externalId) {
    //     final Optional<Institution> existingInstitution = countryRepository.findByExternalId(externalId);
    //     existingInstitution.ifPresent(institution -> {
    //         throw new DuplicateInstitutionException(
    //                 String.format("Institution with id %s exists in the system", institution.getExternalId()));
    //     });
    // }

}

