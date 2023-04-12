package com.firattamur.springanalyticselkstack.service;

import com.firattamur.springanalyticselkstack.dto.GameEventCreateRequest;
import com.firattamur.springanalyticselkstack.model.EventType;
import com.firattamur.springanalyticselkstack.model.GameEventEntity;
import com.firattamur.springanalyticselkstack.repository.GameEventRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GameAnalyticsService {

    private final GameEventRepository gameEventRepository;

    public GameAnalyticsService(GameEventRepository gameEventRepository) {
        this.gameEventRepository = gameEventRepository;
    }

    public GameEventEntity create(GameEventCreateRequest request) {
        GameEventEntity gameEventEntity = new GameEventEntity();

        gameEventEntity.setPlayerId(request.getPlayerId());
        gameEventEntity.setEventType(EventType.valueOf(request.getEventType()));
        gameEventEntity.setTimestamp(LocalDateTime.parse(request.getTimestamp()));
        gameEventEntity.setLevel(request.getLevel());
        gameEventEntity.setScore(request.getScore());

        return gameEventRepository.save(gameEventEntity);
    }

}
