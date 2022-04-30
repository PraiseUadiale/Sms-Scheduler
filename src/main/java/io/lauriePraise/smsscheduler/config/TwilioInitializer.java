package io.lauriePraise.smsscheduler.config;

import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/** Created by Puadi on April, 2022 */
@Configuration
@Slf4j
public class TwilioInitializer {

  private final TwilioConfiguration twilioConfiguration;

  @Autowired
  public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
    this.twilioConfiguration = twilioConfiguration;
    initialiseTwilioAccount();
  }

  private void initialiseTwilioAccount() {
    Twilio.init(twilioConfiguration.getAccountSid(), twilioConfiguration.getAuthToken());
    log.info("Welcome to SMS Scheduler");
  }
}
