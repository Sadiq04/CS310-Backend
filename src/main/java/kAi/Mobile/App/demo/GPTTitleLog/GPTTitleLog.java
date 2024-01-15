package kAi.Mobile.App.demo.GPTTitleLog;

import kAi.Mobile.App.demo.BaseLog.BaseLog;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
@Data
@Document
public class GPTTitleLog extends BaseLog {

    private String title;


    public GPTTitleLog(String title, String user, LocalDateTime time) {
        super(user, time);
        this.title = title;

    }
}
