package ie.williamswalsh.uservice.api.controller;

import ie.williamswalsh.uservice.api.interfaces.PingApi;
import ie.williamswalsh.uservice.service.PingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@RestController
@RequiredArgsConstructor
public class PingController implements PingApi {

    private final PingService service;

    @Override
    public String get() {
        return service.get();
    }
}
