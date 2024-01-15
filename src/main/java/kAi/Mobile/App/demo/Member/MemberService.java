package kAi.Mobile.App.demo.Member;

import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseMember.BaseMemberService;


@Service
public class MemberService extends BaseMemberService<Member, String, MemberRepository> {
    public MemberService(MemberRepository repository) {
        super(repository);
    }
}
