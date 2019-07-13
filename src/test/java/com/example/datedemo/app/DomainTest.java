package com.example.datedemo.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.time.LocalDateTime;

public class DomainTest {

    @Test
    public void testMarshalling2() throws JsonProcessingException {

        Domain domain = new Domain(123, "nameeeee", LocalDateTime.now());
        String result = new ObjectMapper().writeValueAsString(domain);

        System.out.println(result);
    }

}