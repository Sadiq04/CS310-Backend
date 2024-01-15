package kAi.Mobile.App.demo.SubClasses;

import kAi.Mobile.App.demo.Member.Member;
import lombok.Data;

import java.util.List;

@Data
public class ChatSURequestBody {
    private List<String> history;
    private boolean isTitle;
    private String model;
    private String mode;
    private String tone;
    private Member user;

    // Constructors, Getters, and Setters
}