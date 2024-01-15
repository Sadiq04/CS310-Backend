package kAi.Mobile.App.demo.TaskForceMember;

import kAi.Mobile.App.demo.SubClasses.Gender;
import kAi.Mobile.App.demo.SubClasses.Year;
import kAi.Mobile.App.demo.MemberApplication.MemberApplication;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@EqualsAndHashCode(callSuper = true)
public class TaskForceMember extends MemberApplication {
    private LocalDateTime acceptedAt;
    private String acceptedBy;

    public TaskForceMember(String firstName, String lastName, String email, String phoneNumber, String year, String program, String gender, String gpa, String aiInterest, String clubInterest, String clubKnowledge, String linkedIn, String gitHub, LocalDateTime acceptedAt, String acceptedBy, LocalDateTime dateApplied){
        super(firstName, lastName, email, phoneNumber, year, program, gender, gpa, aiInterest, clubInterest, clubKnowledge, linkedIn, gitHub, dateApplied);
        this.acceptedAt = acceptedAt;
        this.acceptedBy = acceptedBy;
    }
}