package com.rede.distributedappserver.controller;

import com.rede.distributedappserver.service.RestService;
import com.rede.distributedappserver.model.MessageEntity;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<MessageEntity> getMessageOfId(@PathVariable String messageId) {
            return ResponseEntity.of(restService.getMessageOfId(messageId));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<MessageEntity> createMessage(@RequestBody(required = true) MessageEntity requestMessage) {
        return ResponseEntity.ok(restService.saveMessage(requestMessage));
    }

    @DeleteMapping(path = "/delete/{messageId}")
    public ResponseEntity<MessageEntity> deleteMessage(@PathVariable String messageId) {
        return ResponseEntity.of(restService.deleteMessage(messageId));
    }
}
