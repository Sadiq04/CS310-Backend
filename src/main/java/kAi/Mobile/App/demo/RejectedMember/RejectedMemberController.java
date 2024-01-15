package kAi.Mobile.App.demo.RejectedMember;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseMember.BaseMemberController;

@RestController
@RequestMapping("/rejectedMembers")
public class RejectedMemberController extends BaseMemberController<RejectedMember, String, RejectedMemberService> {
    public RejectedMemberController(RejectedMemberService service) {
        super(service);
    }
}
