package kAi.Mobile.App.demo.MemberApplication;

import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseMember.BaseMemberService;


@Service
public class MemberApplicationService extends BaseMemberService<MemberApplication, String, MemberApplicationRepository> {
    public MemberApplicationService(MemberApplicationRepository repository) {
        super(repository);
    }
}
