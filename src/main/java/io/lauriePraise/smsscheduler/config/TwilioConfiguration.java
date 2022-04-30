package io.lauriePraise.smsscheduler.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/** Created by Puadi on April, 2022 */
@Configuration
@ConfigurationProperties("twilio")
@Getter
@Setter
public class TwilioConfiguration {

  private String accountSid;
  private String authToken;
  private String trialNumber;
}
