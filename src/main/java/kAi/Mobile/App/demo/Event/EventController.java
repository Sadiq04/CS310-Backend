package kAi.Mobile.App.demo.Event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityController;

@RestController
@RequestMapping("/events")
public class EventController extends BaseActivityController<Event, String, EventService> {
    public EventController(EventService service) {
        super(service);
    }
}

