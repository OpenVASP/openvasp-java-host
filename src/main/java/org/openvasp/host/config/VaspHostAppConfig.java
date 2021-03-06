package org.openvasp.host.config;

import org.openvasp.client.common.Json;
import org.openvasp.host.model.cfg.HostConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Olexandr_Bilovol@epam.com
 */
@Configuration
public class VaspHostAppConfig {

    @Value("${openvasp.host.config:1}")
    private String hostConfigNr;

    @Bean("hostConfig")
    public HostConfig hostConfig() {
        return Json.loadFileYaml(
                HostConfig.class,
                "config",
                String.format("host-config-%s.yaml", hostConfigNr));
    }

}
