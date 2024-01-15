package kAi.Mobile.App.demo.Workshop;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import kAi.Mobile.App.demo.BaseActivity.BaseActivity;
@Data
@Document
public class Workshop extends BaseActivity {
    public Workshop(String title, String description, int order) {
        super(title, description, order);
    }
}
