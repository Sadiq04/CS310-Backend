package kAi.Mobile.App.demo.Member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseMember.BaseMemberController;

@RestController
@RequestMapping("/members")
public class MemberController extends BaseMemberController<Member, String, MemberService> {
    public MemberController(MemberService service) {
        super(service);
    }
}

