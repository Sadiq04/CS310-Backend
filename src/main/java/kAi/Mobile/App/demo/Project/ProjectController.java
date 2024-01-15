package kAi.Mobile.App.demo.Project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityController;

@RestController
@RequestMapping("/projects")
public class ProjectController extends BaseActivityController<Project, String, ProjectService> {
    public ProjectController(ProjectService service) {
        super(service);
    }
}

