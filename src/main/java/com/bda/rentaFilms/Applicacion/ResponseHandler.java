package com.bda.rentaFilms.Applicacion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(String message , HttpStatus status , Object responseObject){
        Map<String, Object > response = new HashMap<>();
        response.put("status", status.value());

        if (isNotBlank(message)) {
            response.put("message", message);
        }
        if (responseObject != null) {
            response.put("data", responseObject);
        }
        return new ResponseEntity<>(response, status);
    }
}
