package com.firattamur.springanalyticselkstack.controller;

import com.firattamur.springanalyticselkstack.dto.GameEventCreateRequest;
import com.firattamur.springanalyticselkstack.model.GameEventEntity;
import com.firattamur.springanalyticselkstack.service.GameAnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game-analytics")
public class GameAnalyticsController {

    private final GameAnalyticsService gameAnalyticsService;

    @Autowired
    public GameAnalyticsController(GameAnalyticsService gameAnalyticsService) {
        this.gameAnalyticsService = gameAnalyticsService;
    }

    @PostMapping
    public GameEventEntity create(@RequestBody GameEventCreateRequest request) {
        return gameAnalyticsService.create(request);
    }

}
