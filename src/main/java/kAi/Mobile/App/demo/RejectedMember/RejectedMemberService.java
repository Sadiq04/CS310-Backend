package kAi.Mobile.App.demo.RejectedMember;

import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseMember.BaseMemberService;


@Service
public class RejectedMemberService extends BaseMemberService<RejectedMember, String, RejectedMemberRepository> {
    public RejectedMemberService(RejectedMemberRepository repository) {
        super(repository);
    }
}