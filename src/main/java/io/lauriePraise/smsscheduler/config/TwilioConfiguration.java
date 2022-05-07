package io.lauriePraise.smsscheduler.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/** Created by Puadi on April, 2022 */
@ConfigurationProperties(prefix = "twilio")
@ConstructorBinding
public class TwilioConfiguration {

  private final String accountSid;
  private final String authToken;
  private final String trialNumber;


  public TwilioConfiguration(String accountSid, String authToken, String trialNumber) {
    this.accountSid = accountSid;
    this.authToken = authToken;
    this.trialNumber = trialNumber;
  }

  public String getAccountSid() {
    return accountSid;
  }

  public String getAuthToken() {
    return authToken;
  }

  public String getTrialNumber() {
    return trialNumber;
  }

  // JAVA POJO:
}
//@ConfigurationProperties is not going to register a spring bean
// Adding @EnableConfigurationProperties(value = MyCustomProperties.class) will create a spring bean