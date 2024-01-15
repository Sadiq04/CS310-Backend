package kAi.Mobile.App.demo.GPTLog;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.MemberApplication.MemberApplication;
import kAi.Mobile.App.demo.BaseLog.BaseLogRepository;
import java.util.Optional;

public interface GPTLogRepository extends BaseLogRepository<GPTLog, String> { }