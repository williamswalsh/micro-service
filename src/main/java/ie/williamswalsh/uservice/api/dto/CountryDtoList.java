package ie.williamswalsh.uservice.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter // TODO - remove getter as its included in record - getter is just name of field - countries()
@RequiredArgsConstructor
public class CountryDtoList {

    private final List<CountryDto> countries;
}
