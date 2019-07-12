package com.example.datedemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class DomainTest {


    @Test
    public void testMarshalling() throws JsonProcessingException {

        Domain domain = new Domain(123, "nameeeee");

        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writeValueAsString(domain);

        System.out.println(result);

        assertTrue(result.equals("{\"id\":123,\"name\":\"nameeeee\"}"));
    }

    @Test
    public void testMarshalling2() throws JsonProcessingException {

        Domain2 domain = new Domain2(123, "nameeeee", LocalDateTime.now());

        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String result = objectMapper.writeValueAsString(domain);

        System.out.println(result);

        //assertTrue(result.equals("{\"id\":123,\"name\":\"nameeeee\"}"));
    }

}