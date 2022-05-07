package io.lauriePraise.smsscheduler.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwilioConfigurationTest {

  @Test
  void testConstructor() {
    TwilioConfiguration actualTwilioConfiguration = new TwilioConfiguration("3", "ABC123", "42");

    assertEquals("3", actualTwilioConfiguration.getAccountSid());
    assertEquals("ABC123", actualTwilioConfiguration.getAuthToken());
    assertEquals("42", actualTwilioConfiguration.getTrialNumber());
  }
}

