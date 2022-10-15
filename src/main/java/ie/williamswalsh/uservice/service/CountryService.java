package ie.williamswalsh.uservice.service;

import ie.williamswalsh.uservice.api.dto.CountryDtoList;
import ie.williamswalsh.uservice.api.dto.request.CountryRequest;


/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
public interface CountryService {

    CountryDtoList list();

    void create(CountryRequest countryRequest);

    // Institution findByExternalId(final String externalId);
    //
    // void create(InstitutionRequest institutionRequest);
}
