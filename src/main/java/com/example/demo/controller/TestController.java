package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.Book;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String test() {
        log.debug("testing");
        return "testing";
    }

    @PostMapping("/book")
    public String valid(@Valid @RequestBody Book book, BindingResult rs) {
        log.info("incoming");
        log.info("book " + book);
        if(rs.hasErrors()) {
            return "error";
        }
        
        log.debug("123");
        return "book";
    }
}
