package kAi.Mobile.App.demo.Project;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseActivity.BaseActivityService;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService extends BaseActivityService<Project, String, ProjectRepository> {
    public ProjectService(ProjectRepository repository) {
        super(repository);
    }
}