package net.l2labs.samples.spring.cloud.config.basic.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloRestController {

    @Value("${config.name:config.name}")
    private String configName;

    @Value("${config.profile:config.profile}")
    private String configProfile;

    @GetMapping({"", "/"})
    public String[] hello() {

        return new String[]{
                configName, configProfile
        };
    }

}
