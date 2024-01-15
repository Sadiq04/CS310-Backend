package kAi.Mobile.App.demo.Workshop;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.Workshop.Workshop;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityRepository;

public interface WorkshopRepository extends BaseActivityRepository<Workshop, String> { }