package net.l2labs.samples.spring.cloud.config.plain.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HomeRestController {

    @Value("${spring.profiles.include:spring.profiles.include}")
    private String springProfiles;

    @Value("${config.profile:config.profile}")

    private String configProfile;

    @Value("${config.name:config.name}")
    private String configName;

    @Value("${config.symmetric:config.symmetric}")
    private String symmetric;

    @Value("${config.asymmetric:config.asymmetric}")
    private String asymmetric;

    @Value("${config.asymmetric-pem:config.asymmetric-pem}")
    private String asymmetricPem;

    @GetMapping({"", "/"})
    public String[] hello() {

        return new String[]{
                springProfiles, configProfile, configName, symmetric, asymmetric, asymmetricPem
        };
    }

}
