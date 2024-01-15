package kAi.Mobile.App.demo.MemberApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseMember.BaseMemberController;

@RestController
@RequestMapping("/memberApplications")
public class MemberApplicationController extends BaseMemberController<MemberApplication, String, MemberApplicationService> {
    public MemberApplicationController(MemberApplicationService service) {
        super(service);
    }
}
