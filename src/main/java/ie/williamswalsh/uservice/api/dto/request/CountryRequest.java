package ie.williamswalsh.uservice.api.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author William Walsh
 * @version 16 Oct 2022
 */
@Getter
@Setter
public class CountryRequest {
    @NotNull
    private String name;

    @NotNull
    private String code;
}
