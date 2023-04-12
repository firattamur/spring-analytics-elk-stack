package com.firattamur.springanalyticselkstack.repository;

import com.firattamur.springanalyticselkstack.model.GameEventEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface GameEventRepository extends ElasticsearchRepository<GameEventEntity, String> {
}
