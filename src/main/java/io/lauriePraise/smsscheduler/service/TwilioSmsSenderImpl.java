package io.lauriePraise.smsscheduler.service;

import static io.lauriePraise.smsscheduler.utils.SmsUtils.isPhoneNumberValid;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import io.lauriePraise.smsscheduler.config.TwilioConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

    String phoneNumber = smsRequest.getPhoneNumber()
        .trim()
        .stripLeading()
        .stripTrailing();
    if (isPhoneNumberValid(phoneNumber)) {
      PhoneNumber to = new PhoneNumber(phoneNumber);
      PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
      String messageToSend = smsRequest.getMessage();
      Message message = Message.creator(to, from, messageToSend).create();
      log.info("Sending sms from {}", twilioConfiguration.getTrialNumber());
    }
    else {
      throw new IllegalArgumentException(
          "Phone number {} is invalid for the United Kingdom".format(phoneNumber));
    }
  }


}
