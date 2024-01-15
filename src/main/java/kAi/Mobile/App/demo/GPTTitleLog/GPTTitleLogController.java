package kAi.Mobile.App.demo.GPTTitleLog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kAi.Mobile.App.demo.BaseLog.BaseLogController;

@RestController
@RequestMapping("/gptTitleLogs")
public class GPTTitleLogController extends BaseLogController<GPTTitleLog, String, GPTTitleLogService> {
    public GPTTitleLogController(GPTTitleLogService service) {
        super(service);
    }
}
