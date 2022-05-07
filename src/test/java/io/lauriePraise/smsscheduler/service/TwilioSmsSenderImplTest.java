package io.lauriePraise.smsscheduler.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import io.lauriePraise.smsscheduler.config.TwilioConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {TwilioSmsSenderImpl.class, TwilioConfiguration.class})
@ExtendWith(SpringExtension.class)
class TwilioSmsSenderImplTest {

  @Autowired
  private TwilioConfiguration twilioConfiguration;

  @Autowired
  private TwilioSmsSenderImpl twilioSmsSenderImpl;

  @Test
  void testSendSms() {
    assertThrows(IllegalArgumentException.class,
        () -> this.twilioSmsSenderImpl
            .sendSms(new SMSRequest("4105551212", "Not all who wander are lost")));
    assertThrows(IllegalArgumentException.class,
        () -> this.twilioSmsSenderImpl
            .sendSms(new SMSRequest("+44 1865 4960636", "Not all who wander are lost")));
    assertThrows(IllegalArgumentException.class,
        () -> this.twilioSmsSenderImpl
            .sendSms(new SMSRequest("42", "Not all who wander are lost")));
  }
}

