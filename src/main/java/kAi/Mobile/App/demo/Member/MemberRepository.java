package kAi.Mobile.App.demo.Member;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.MemberApplication.MemberApplication;
import kAi.Mobile.App.demo.BaseMember.BaseMemberRepository;
import java.util.Optional;

public interface MemberRepository extends BaseMemberRepository<Member, String> { }