package kAi.Mobile.App.demo.GPTLog;

import kAi.Mobile.App.demo.BaseLog.BaseLog;
import kAi.Mobile.App.demo.Member.Member;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
@Document
public class GPTLog extends BaseLog {
    private String completionCost;
    private String model;
    private String key;
    private String promptCost;
    private String response;
    private int totalCompletionTokens;
    private String totalCost;
    private int totalPromptTokens;
    public GPTLog(String completionCost, String model, String key, String promptCost, String response, LocalDateTime time, String user, int totalCompletionTokens, String totalCost, int totalPromptTokens) {
        super(user, time);
        this.completionCost = completionCost;
        this.model = model;
        this.key = key;
        this.promptCost = promptCost;
        this.response = response;
        this.totalCompletionTokens = totalCompletionTokens;
        this.totalCost = totalCost;
        this.totalPromptTokens = totalPromptTokens;
    }
}
