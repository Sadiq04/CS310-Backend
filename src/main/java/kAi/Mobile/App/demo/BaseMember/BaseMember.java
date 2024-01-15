package kAi.Mobile.App.demo.BaseMember;

import kAi.Mobile.App.demo.SubClasses.Gender;
import kAi.Mobile.App.demo.SubClasses.Year;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public abstract class BaseMember {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private String phoneNumber;
    private String year;
    private String program;
    private String gpa;
    private String aiInterest;
    private String clubInterest;
    private String clubKnowledge;

    public BaseMember(String firstName, String lastName, String email, String phoneNumber, String year, String program, String gpa, String aiInterest, String clubInterest, String clubKnowledge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.year = year;
        this.program = program;
        this.gpa = gpa;
        this.aiInterest = aiInterest;
        this.clubInterest = clubInterest;
        this.clubKnowledge = clubKnowledge;
    }
}
