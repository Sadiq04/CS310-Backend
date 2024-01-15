package kAi.Mobile.App.demo.JobPosting;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.JobPosting.JobPosting;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityRepository;
public interface JobPostingRepository extends BaseActivityRepository<JobPosting, String> { }