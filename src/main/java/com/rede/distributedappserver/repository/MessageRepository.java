package com.rede.distributedappserver.repository;

import com.rede.distributedappserver.entity.MessageEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
}
