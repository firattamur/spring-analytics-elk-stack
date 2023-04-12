package com.firattamur.springanalyticselkstack.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;

@Document(indexName = "game-event")
@Data
public class GameEventEntity {

    @Id
    private String id;
    private String playerId;
    private EventType eventType;
    private LocalDateTime timestamp;
    private Integer level;
    private Integer score;


}
