package kAi.Mobile.App.demo.Event;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.Event.Event;

import java.util.Optional;

import kAi.Mobile.App.demo.BaseActivity.BaseActivityRepository;

public interface EventRepository extends BaseActivityRepository<Event, String> { }