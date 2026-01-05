package org.abc.impl.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("org.abc.impl")
@Configuration
public class CConfig {
    private static Logger log = LoggerFactory.getLogger(CConfig.class);

    public CConfig() {
        log.info("CConfig instantiated");
    }
}
