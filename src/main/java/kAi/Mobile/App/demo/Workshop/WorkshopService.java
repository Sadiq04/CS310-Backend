package kAi.Mobile.App.demo.Workshop;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityService;

@Service
public class WorkshopService extends BaseActivityService<Workshop, String, WorkshopRepository> {
    public WorkshopService(WorkshopRepository repository) {
        super(repository);
    }
}
