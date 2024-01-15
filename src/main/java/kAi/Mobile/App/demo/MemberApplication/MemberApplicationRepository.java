package kAi.Mobile.App.demo.MemberApplication;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.MemberApplication.MemberApplication;
import kAi.Mobile.App.demo.BaseMember.BaseMemberRepository;
import java.util.Optional;

public interface MemberApplicationRepository extends BaseMemberRepository<MemberApplication, String> { }