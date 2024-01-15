package kAi.Mobile.App.demo.SubClasses;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Data
@Document(collection = "emails")
public class EmailsDocument {
    @Id
    private String id;
    private String type; // "member" or "application"
    private List<String> emails;
}