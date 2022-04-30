package io.lauriePraise.smsscheduler.service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import io.lauriePraise.smsscheduler.config.TwilioConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/** Created by Puadi on April, 2022 */
@Component
@Qualifier(value = "twilio")
@Slf4j
public class TwilioSmsSenderImpl implements SmsSender {

  private final TwilioConfiguration twilioConfiguration;

  @Autowired
  public TwilioSmsSenderImpl(TwilioConfiguration twilioConfiguration) {
    this.twilioConfiguration = twilioConfiguration;
  }

  @Override
  public void sendSms(SMSRequest smsRequest) {

    if (isPhoneNumberValid(smsRequest.getPhoneNumber())) {

      PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
      PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
      String messageToSend = smsRequest.getMessage();
      Message message = Message.creator(to, from, messageToSend).create();
      log.info("Sending sms from {}", twilioConfiguration.getTrialNumber());
    } else {
      throw new IllegalArgumentException(
          "Phone number {} is invalid".format(smsRequest.getPhoneNumber()));
    }
  }

  //TODO some form of regex valdiations
  private boolean isPhoneNumberValid(String phoneNumber) {

    return true;
  }
}
