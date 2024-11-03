package com.rede.distributedappserver.repository;

import com.rede.distributedappserver.model.MessageEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends MongoRepository<MessageEntity, String> {

    @Query(value = "{id :  '?0'}")
    Optional<MessageEntity> findByMessageId(String id);

    @Query(value = "{id : '?0'}")
    List<MessageEntity> findAllById(String id);

    @Query(value = "{id :  '?0'}", delete = true)
    Optional<MessageEntity> deleteMessageById(String Id);
}
