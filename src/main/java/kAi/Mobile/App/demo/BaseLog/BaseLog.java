package kAi.Mobile.App.demo.BaseLog;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public abstract class BaseLog {
    @Id
    private String id;
    private String user;
    private LocalDateTime time;

    public BaseLog(String user, LocalDateTime time) {
        this.user = user;
        this.time = time;
    }
}