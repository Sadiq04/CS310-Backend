package kAi.Mobile.App.demo.TaskForceMember;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseMember.BaseMemberController;

@RestController
@RequestMapping("/taskForceMembers")
public class TaskForceMemberController extends BaseMemberController<TaskForceMember, String, TaskForceMemberService> {
    public TaskForceMemberController(TaskForceMemberService service) {
        super(service);
    }
}