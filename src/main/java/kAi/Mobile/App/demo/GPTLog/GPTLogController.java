package kAi.Mobile.App.demo.GPTLog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseLog.BaseLogController;

@RestController
@RequestMapping("/gptLogs")
public class GPTLogController extends BaseLogController<GPTLog, String, GPTLogService> {
    public GPTLogController(GPTLogService service) {
        super(service);
    }
}
