package kAi.Mobile.App.demo.Member;

import kAi.Mobile.App.demo.BaseMember.BaseMember;
import kAi.Mobile.App.demo.SubClasses.Gender;
import kAi.Mobile.App.demo.SubClasses.Year;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@EqualsAndHashCode(callSuper = true)
public class Member extends BaseMember {
    private LocalDateTime memberSince;
    private String addedBy;

    public Member(String firstName, String lastName, String email, String phoneNumber, String year, String program, String gender, String gpa, String aiInterest, String clubInterest, String clubKnowledge, LocalDateTime memberSince, String addedBy){
        super(firstName, lastName, email, phoneNumber, year, program, gpa, aiInterest, clubInterest, clubKnowledge);
        this.memberSince = memberSince;
        this.addedBy = addedBy;
    }
}
