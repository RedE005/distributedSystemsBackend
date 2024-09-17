package com.rede.distributedappserver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class MessageEntity {

    @Column(name = "message")
    private String message;

    @Id
    @Column(name = "message_id")
    @GeneratedValue(strategy = IDENTITY)
    private long Id;
}
