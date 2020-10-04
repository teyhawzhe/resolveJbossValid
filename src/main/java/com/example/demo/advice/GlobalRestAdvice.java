package com.example.demo.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalRestAdvice {

//    @ExceptionHandler(value = Exception.class)
//    public Map errorHandler(Exception ex) {
//        Map map = new HashMap();
//        map.put("code", 100);
//        map.put("msg", ex.getMessage());
//        return map;
//    }

}
