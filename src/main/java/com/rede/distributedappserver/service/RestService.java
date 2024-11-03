package com.rede.distributedappserver.service;

import com.rede.distributedappserver.model.MessageEntity;
import com.rede.distributedappserver.repository.MessageRepository;

import org.bson.types.ObjectId;
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

    public Optional<MessageEntity> getMessageOfId(String Id) {
        return messageRepository.findByMessageId(Id);
    }

    public MessageEntity saveMessage(MessageEntity message) {
        return messageRepository.save(message);
    }

    public Optional<MessageEntity> deleteMessage(String Id) {
        return messageRepository.deleteMessageById(Id);
    }
}
