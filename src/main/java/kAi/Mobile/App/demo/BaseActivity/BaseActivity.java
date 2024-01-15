package kAi.Mobile.App.demo.BaseActivity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public abstract class BaseActivity {
    @Id
    private String id;
    private String title;
    private String description;
    private int order;

    public BaseActivity(String title, String description, int order) {
        this.title = title;
        this.description = description;
        this.order = order;
    }
}