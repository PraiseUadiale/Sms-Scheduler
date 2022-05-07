package io.lauriePraise.smsscheduler.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TwilioConfigurationTest {

  @Test
  void testCanEqual() {
    assertFalse((new TwilioConfiguration()).canEqual("Other"));
    assertFalse((new TwilioConfiguration()).canEqual("Other"));
  }

  @Test
  void testCanEqual2() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.canEqual(twilioConfiguration1));
  }

  @Test
  void testCanEqual3() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.canEqual(twilioConfiguration1));
  }

  @Test
  void testConstructor() {
    TwilioConfiguration actualTwilioConfiguration = new TwilioConfiguration();
    actualTwilioConfiguration.setAccountSid("3");
    actualTwilioConfiguration.setAuthToken("ABC123");
    actualTwilioConfiguration.setTrialNumber("42");
    assertEquals("3", actualTwilioConfiguration.getAccountSid());
    assertEquals("ABC123", actualTwilioConfiguration.getAuthToken());
    assertEquals("42", actualTwilioConfiguration.getTrialNumber());
    assertEquals("TwilioConfiguration(accountSid=3, authToken=ABC123, trialNumber=42)",
        actualTwilioConfiguration.toString());
  }

  @Test
  void testConstructor2() {
    TwilioConfiguration actualTwilioConfiguration = new TwilioConfiguration();
    actualTwilioConfiguration.setAccountSid("3");
    actualTwilioConfiguration.setAuthToken("ABC123");
    actualTwilioConfiguration.setTrialNumber("42");
    assertEquals("3", actualTwilioConfiguration.getAccountSid());
    assertEquals("ABC123", actualTwilioConfiguration.getAuthToken());
    assertEquals("42", actualTwilioConfiguration.getTrialNumber());
    assertEquals("TwilioConfiguration(accountSid=3, authToken=ABC123, trialNumber=42)",
        actualTwilioConfiguration.toString());
  }

  @Test
  void testEquals() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(null));
  }

  @Test
  void testEquals2() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals("Different type to TwilioConfiguration"));
  }

  @Test
  void testEquals3() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration.hashCode());
  }

  @Test
  void testEquals4() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }

  @Test
  void testEquals5() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("ABC123");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals6() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid(null);
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals7() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("3");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals8() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken(null);
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals9() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("3");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals10() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber(null);

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals11() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid(null);
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid(null);
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }

  @Test
  void testEquals12() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken(null);
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken(null);
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }

  @Test
  void testEquals13() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber(null);

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber(null);
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }

  @Test
  void testEquals14() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(null));
  }

  @Test
  void testEquals15() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals("Different type to TwilioConfiguration"));
  }

  @Test
  void testEquals16() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration.hashCode());
  }

  @Test
  void testEquals17() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }

  @Test
  void testEquals18() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("ABC123");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals19() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid(null);
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals20() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("3");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals21() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken(null);
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals22() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("3");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals23() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber(null);

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertFalse(twilioConfiguration.equals(twilioConfiguration1));
  }

  @Test
  void testEquals24() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid(null);
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid(null);
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }

  @Test
  void testEquals25() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken(null);
    twilioConfiguration.setTrialNumber("42");

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken(null);
    twilioConfiguration1.setTrialNumber("42");
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }

  @Test
  void testEquals26() {
    TwilioConfiguration twilioConfiguration = new TwilioConfiguration();
    twilioConfiguration.setAccountSid("3");
    twilioConfiguration.setAuthToken("ABC123");
    twilioConfiguration.setTrialNumber(null);

    TwilioConfiguration twilioConfiguration1 = new TwilioConfiguration();
    twilioConfiguration1.setAccountSid("3");
    twilioConfiguration1.setAuthToken("ABC123");
    twilioConfiguration1.setTrialNumber(null);
    assertTrue(twilioConfiguration.equals(twilioConfiguration1));
    int expectedHashCodeResult = twilioConfiguration.hashCode();
    assertEquals(expectedHashCodeResult, twilioConfiguration1.hashCode());
  }
}

