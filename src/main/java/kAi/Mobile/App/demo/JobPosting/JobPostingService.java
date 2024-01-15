package kAi.Mobile.App.demo.JobPosting;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityService;
import org.springframework.stereotype.Service;

@Service
public class JobPostingService extends BaseActivityService<JobPosting, String, JobPostingRepository> {
    public JobPostingService(JobPostingRepository repository) {
        super(repository);
    }
}
