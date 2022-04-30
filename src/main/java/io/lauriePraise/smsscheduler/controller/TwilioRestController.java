package io.lauriePraise.smsscheduler.controller;

import io.lauriePraise.smsscheduler.service.SMSRequest;
import io.lauriePraise.smsscheduler.service.TwilioSmsService;
import javax.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Created by Puadi on April, 2022 */
@RestController("api/v1/sms")
public class TwilioRestController {

  private final TwilioSmsService service;

  @Autowired
  public TwilioRestController(TwilioSmsService service) {
    this.service = service;
  }

  @PostMapping("/send")
  public void sendSmsToPhoneNumber(@Valid @RequestBody SMSRequest request) {

    service.sendSms(request);
  }
  @GetMapping("/test")
  public String hello() {
    return "Hello";
  }
}
