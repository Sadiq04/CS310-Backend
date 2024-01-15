package kAi.Mobile.App.demo.JobPosting;

import kAi.Mobile.App.demo.BaseActivity.BaseActivity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class JobPosting extends BaseActivity {
    private String companyImage;
    private String companyName;
    private String jobPostingLink;
    private String jobLocation;
    private String[] skills;

    public JobPosting(String companyImage, String companyName, String description, String jobPostingLink, String title, String jobLocation, int order, String[] skills) {
        super(title, description, order);
        this.companyImage = companyImage;
        this.companyName = companyName;
        this.jobPostingLink = jobPostingLink;
        this.jobLocation = jobLocation;
        this.skills = skills;
    }
}
