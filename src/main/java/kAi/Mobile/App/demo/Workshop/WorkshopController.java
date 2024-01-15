package kAi.Mobile.App.demo.Workshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityController;

@RestController
@RequestMapping("/workshops")
public class WorkshopController extends BaseActivityController<Workshop, String, WorkshopService> {
    public WorkshopController(WorkshopService service) {
        super(service);
    }
}
