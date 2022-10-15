package ie.williamswalsh.uservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {

    private String name;

    private String code;
}
