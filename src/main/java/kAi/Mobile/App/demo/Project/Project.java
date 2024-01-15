package kAi.Mobile.App.demo.Project;

import kAi.Mobile.App.demo.BaseActivity.BaseActivity;
import kAi.Mobile.App.demo.Workshop.Workshop;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityRepository;
@Document(collection = "projects")
@Data
@EqualsAndHashCode(callSuper = true)
public class Project extends BaseActivity {
    private String imgLink;

    public Project(String title, String description, int order, String imgLink) {
        super(title, description, order);;
        this.imgLink = imgLink;
    }
    /*
    public Member(String firstName, String lastName, String email, String phoneNumber, Year year, String program, Gender gender, Double gpa, String aiInterest, String clubInterest, String clubKnowledge, String linkedIn, String gitHub, ZonedDateTime memberSince, String addedBy){
        super(firstName, lastName, email, phoneNumber, year, program, gender, gpa, aiInterest, clubInterest, clubKnowledge, linkedIn, gitHub);
        this.memberSince = memberSince;
        this.addedBy = addedBy;
    }
    */
}
