package io.lauriePraise.smsscheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/** Created by Puadi on April, 2022 */
@Service
public class TwilioSmsService {

  //Coding to Interfaces
  @Qualifier("twilio")
  private final SmsSender smsSender;

  @Autowired
  public TwilioSmsService( SmsSender smsSender) {
    this.smsSender = smsSender;
  }

  public void sendSms(SMSRequest request) {
    smsSender.sendSms(request);
  }
}
