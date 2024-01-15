package kAi.Mobile.App.demo.TaskForceMember;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.MemberApplication.MemberApplication;
import kAi.Mobile.App.demo.BaseMember.BaseMemberRepository;
import java.util.Optional;

public interface TaskForceMemberRepository extends BaseMemberRepository<TaskForceMember, String> { }