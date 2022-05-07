package io.lauriePraise.smsscheduler.service;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {TwilioSmsService.class})
@ExtendWith(SpringExtension.class)
class TwilioSmsServiceTest {

  @MockBean
  private SmsSender smsSender;

  @Autowired
  private TwilioSmsService twilioSmsService;

  @Test
  void testSendSms() {
    doNothing().when(this.smsSender).sendSms((SMSRequest) any());
    this.twilioSmsService.sendSms(new SMSRequest("4105551212", "Not all who wander are lost"));
    verify(this.smsSender).sendSms((SMSRequest) any());
  }
}

