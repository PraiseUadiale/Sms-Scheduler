package io.lauriePraise.smsscheduler.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/** Created by Puadi on April, 2022 */
@Configuration
@ConfigurationProperties(prefix = "twilio")
@Data
public class TwilioConfiguration {

  private String accountSid;
  private String authToken;
  private String trialNumber;

  // JAVA POJO:
}
