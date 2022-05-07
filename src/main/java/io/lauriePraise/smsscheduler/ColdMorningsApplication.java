package io.lauriePraise.smsscheduler;

import io.lauriePraise.smsscheduler.config.TwilioConfiguration;
import javax.swing.event.TreeWillExpandListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties(value = {TwilioConfiguration.class})
public class ColdMorningsApplication {

	public static void main(String[] args) {
	SpringApplication.run(ColdMorningsApplication.class, args);
	}


}
