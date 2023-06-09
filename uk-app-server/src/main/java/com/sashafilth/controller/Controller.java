package com.sashafilth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/")
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("Hello from UK server", HttpStatus.OK);
    }
}
