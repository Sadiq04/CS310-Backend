package kAi.Mobile.App.demo.TaskForceMember;

import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseMember.BaseMemberService;


@Service
public class TaskForceMemberService extends BaseMemberService<TaskForceMember, String, TaskForceMemberRepository> {
    public TaskForceMemberService(TaskForceMemberRepository repository) {
        super(repository);
    }
}