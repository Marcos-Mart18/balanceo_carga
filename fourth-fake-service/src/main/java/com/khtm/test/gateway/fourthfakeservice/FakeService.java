package com.khtm.test.gateway.fourthfakeservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakeService {

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public String sayHello() {
        return "HELLO FROM FOURTH-FAKE-SERVER";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/howru")
    public String sayhowru() {
        return "Fine, FROM FOURTH-FAKE-SERVER";
    }
}
