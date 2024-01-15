package kAi.Mobile.App.demo.GPTLog;

import org.springframework.stereotype.Service;
import kAi.Mobile.App.demo.BaseLog.BaseLogService;


@Service
public class GPTLogService extends BaseLogService<GPTLog, String, GPTLogRepository> {
    public GPTLogService(GPTLogRepository repository) {
        super(repository);
    }
}