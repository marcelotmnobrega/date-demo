package com.example.datedemo.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class DomainTest {

    @Test
    void testMarshalling() throws JsonProcessingException {

        Domain domain = new Domain(123, "nameeeee", LocalDateTime.now());
        String result = new ObjectMapper().writeValueAsString(domain);

        System.out.println(result);
    }

}