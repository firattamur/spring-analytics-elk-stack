package com.firattamur.springanalyticselkstack.dto;


import lombok.Data;

@Data
public class GameEventCreateRequest {

    private String playerId;
    private String eventType;
    private String timestamp;
    private Integer level;
    private Integer score;

}
