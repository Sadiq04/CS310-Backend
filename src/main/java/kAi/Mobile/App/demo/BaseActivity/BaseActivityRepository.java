package kAi.Mobile.App.demo.BaseActivity;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

public interface BaseActivityRepository<T extends BaseActivity, ID extends Serializable> extends MongoRepository<T, ID> {}