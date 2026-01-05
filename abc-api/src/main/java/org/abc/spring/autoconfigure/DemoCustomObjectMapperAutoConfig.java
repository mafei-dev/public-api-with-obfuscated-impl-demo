package org.abc.spring.autoconfigure;

import org.abc.api.config.CustomMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoCustomObjectMapperAutoConfig {

    @Bean
    public CustomMapper customMapper(){
        return new CustomMapper();
    }
}
