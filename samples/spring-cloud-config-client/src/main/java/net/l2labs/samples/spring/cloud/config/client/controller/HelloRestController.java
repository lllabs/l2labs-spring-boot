package net.l2labs.samples.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloRestController {

    @Value("${config.value.one:value one}")
    private String one;

    @Value("${config.value.two:value two}")
    private String two;

    @Value("${config.value.profile:value profile}")
    private String profile;

    @Value("${config.value.properties:value properties}")
    private String properties;

    @Value("${core.config.one:config one}")
    private String coreOne;

    @GetMapping({"", "/"})
    public String[] hello() {

        return new String[]{
                one, two, profile, properties, coreOne
        };
    }

}
