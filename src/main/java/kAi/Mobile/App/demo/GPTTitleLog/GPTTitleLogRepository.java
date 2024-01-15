package kAi.Mobile.App.demo.GPTTitleLog;

import org.springframework.data.mongodb.repository.MongoRepository;
import kAi.Mobile.App.demo.MemberApplication.MemberApplication;
import kAi.Mobile.App.demo.BaseLog.BaseLogRepository;
import java.util.Optional;

public interface GPTTitleLogRepository extends BaseLogRepository<GPTTitleLog, String> { }