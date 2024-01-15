package kAi.Mobile.App.demo.RejectedMember;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.MemberApplication.MemberApplication;
import kAi.Mobile.App.demo.BaseMember.BaseMemberRepository;
import java.util.Optional;

public interface RejectedMemberRepository extends BaseMemberRepository<RejectedMember, String> { }