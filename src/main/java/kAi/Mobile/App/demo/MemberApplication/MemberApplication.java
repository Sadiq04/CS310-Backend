package kAi.Mobile.App.demo.MemberApplication;

import kAi.Mobile.App.demo.BaseMember.BaseMember;
import kAi.Mobile.App.demo.SubClasses.Gender;
import kAi.Mobile.App.demo.SubClasses.Year;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;

@Document
public class MemberApplication extends BaseMember {

    private final LocalDateTime dateApplied;


    public MemberApplication(String firstName, String lastName, String email, String phoneNumber, String year, String program, String gender, String gpa, String aiInterest, String clubInterest, String clubKnowledge, String linkedIn, String gitHub, LocalDateTime dateApplied) {
        super(firstName, lastName, email, phoneNumber, year, program, gpa, aiInterest, clubInterest, clubKnowledge);
        this.dateApplied = dateApplied;
    }

}
