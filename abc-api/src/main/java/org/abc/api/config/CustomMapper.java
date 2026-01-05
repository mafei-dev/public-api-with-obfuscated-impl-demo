package org.abc.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomMapper extends ObjectMapper {

    public CustomMapper() {
        System.out.println("CustomMapper.CustomMapper:initiated");
    }
}
