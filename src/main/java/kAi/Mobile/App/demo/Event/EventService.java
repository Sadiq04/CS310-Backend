package kAi.Mobile.App.demo.Event;

import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityService;


@Service
public class EventService extends BaseActivityService<Event, String, EventRepository> {
    public EventService(EventRepository repository) {
        super(repository);
    }
}