package kAi.Mobile.App.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import kAi.Mobile.App.demo.Event.Event;

import kAi.Mobile.App.demo.Event.EventRepository;

@SpringBootApplication
public class KAiMobileAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KAiMobileAppApplication.class, args);
	}

}
