package io.lauriePraise.smsscheduler.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SMSRequestTest {

  @Test
  void testConstructor() {
    SMSRequest actualSmsRequest = new SMSRequest("4105551212", "Not all who wander are lost");

    assertEquals("Not all who wander are lost", actualSmsRequest.getMessage());
    assertEquals("SMSRequest(phoneNumber=4105551212, message=Not all who wander are lost)",
        actualSmsRequest.toString());
    assertEquals("4105551212", actualSmsRequest.getPhoneNumber());
  }

  @Test
  void testConstructor2() {
    SMSRequest actualSmsRequest = new SMSRequest("4105551212", "Not all who wander are lost");

    assertEquals("Not all who wander are lost", actualSmsRequest.getMessage());
    assertEquals("SMSRequest(phoneNumber=4105551212, message=Not all who wander are lost)",
        actualSmsRequest.toString());
    assertEquals("4105551212", actualSmsRequest.getPhoneNumber());
  }
}

