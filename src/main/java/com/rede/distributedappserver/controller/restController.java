package com.rede.distributedappserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class restController {
    ResponseEntity<String> responseEntity;
    @GetMapping(path = "/allRequests")
    public ResponseEntity<String> getAllRequests () {
        responseEntity = new ResponseEntity<>("Returned all request", HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping(path = "/message/{messageId}")
    public ResponseEntity<String> getMessageOfId(@PathVariable Long messageId) {
        responseEntity = new ResponseEntity<>(String.valueOf(messageId), HttpStatus.OK);
        return responseEntity;
    }
}
