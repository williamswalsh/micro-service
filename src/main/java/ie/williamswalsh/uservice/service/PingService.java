package ie.williamswalsh.uservice.service;

import org.springframework.stereotype.Service;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
@Service
public class PingService {

    public static final String SYSTEM_UP = "UP";

    public String get() {
        return SYSTEM_UP;
    }
}
