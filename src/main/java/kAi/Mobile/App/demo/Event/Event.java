package kAi.Mobile.App.demo.Event;

import kAi.Mobile.App.demo.BaseActivity.BaseActivity;
import kAi.Mobile.App.demo.Project.Project;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

import kAi.Mobile.App.demo.BaseActivity.BaseActivityRepository;
@Document(collection = "events")
@Data
@EqualsAndHashCode(callSuper = true)
public class Event extends BaseActivity {
    private String summary;
    private LocalDateTime date;
    private String googleFormLink;
    private boolean isDone;
    private String location;
    private String name;
    private String time;
    private int quota;
    private String imgLink;

    public Event(String title, String description, int order, String imgLink, String summary, LocalDateTime date, String googleFormLink, boolean isDone, String location, String name, String time, int quota) {
        super(title, description, order);
        this.summary = summary;
        this.date = date;
        this.googleFormLink = googleFormLink;
        this.isDone = isDone;
        this.location = location;
        this.name = name;
        this.time = time;
        this.quota = quota;
        this.imgLink = imgLink;
    }
}
