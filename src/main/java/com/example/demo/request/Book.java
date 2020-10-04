package com.example.demo.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 6851395173525641880L;

    @NotBlank(message = "blank")
    private String bookCode;

    @NotBlank(message = "blank")
    private String bookName;
}
