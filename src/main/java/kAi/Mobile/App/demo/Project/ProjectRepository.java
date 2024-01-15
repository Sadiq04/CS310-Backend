package kAi.Mobile.App.demo.Project;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.Project.Project;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityRepository;

public interface ProjectRepository extends BaseActivityRepository<Project, String> { }