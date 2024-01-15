package kAi.Mobile.App.demo.JobPosting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityController;

@RestController
@RequestMapping("/jobPostings")
public class JobPostingController extends BaseActivityController<JobPosting, String, JobPostingService> {
    public JobPostingController(JobPostingService service) {
        super(service);
    }
}
