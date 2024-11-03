package com.rede.distributedappserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Getter
@Setter
@Document(value = "DistributedAppMessage")
public class MessageEntity {
    private String message;

    @Id
    private String id;
}
