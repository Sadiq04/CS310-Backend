package kAi.Mobile.App.demo.GPTTitleLog;

import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseLog.BaseLogService;


@Service
public class GPTTitleLogService extends BaseLogService<GPTTitleLog, String, GPTTitleLogRepository> {
    public GPTTitleLogService(GPTTitleLogRepository repository) {
        super(repository);
    }
}