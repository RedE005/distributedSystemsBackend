package com.rede.distributedappserver.service;

import com.rede.distributedappserver.model.MessageEntity;
import com.rede.distributedappserver.repository.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestService {

    private final MessageRepository messageRepository;

    @Autowired
    public RestService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<MessageEntity> getAllMessages() {
        return messageRepository.findAll();
    }

    public Optional<MessageEntity> getMessageOfId(Long Id) {
        return messageRepository.findById(Id);
    }

    public MessageEntity saveMessage(MessageEntity message) {
        return messageRepository.save(message);
    }
}
