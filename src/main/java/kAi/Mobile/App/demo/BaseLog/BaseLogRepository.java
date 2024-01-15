package kAi.Mobile.App.demo.BaseLog;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

public interface BaseLogRepository<T extends BaseLog, ID extends Serializable> extends MongoRepository<T, ID> {}
