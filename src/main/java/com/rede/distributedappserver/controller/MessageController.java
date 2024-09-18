package com.rede.distributedappserver.controller;

import com.rede.distributedappserver.service.RestService;
import com.rede.distributedappserver.model.MessageEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
@RequestMapping("/")
public class MessageController {
    private final RestService restService;

    @Autowired
    public MessageController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping(path = "/allRequests")
    public ResponseEntity<List<MessageEntity>> getAllRequests () {
       List<MessageEntity> responseList = restService.getAllMessages();
        return ResponseEntity.ok(responseList);
    }

    @GetMapping(path = "/message/{messageId}")
    public ResponseEntity<MessageEntity> getMessageOfId(@PathVariable Long messageId) {
            return ResponseEntity.of(restService.getMessageOfId(messageId));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<MessageEntity> createMessage(@RequestBody(required = true) MessageEntity requestMessage) {
        return ResponseEntity.ok(restService.saveMessage(requestMessage));
    }
}
