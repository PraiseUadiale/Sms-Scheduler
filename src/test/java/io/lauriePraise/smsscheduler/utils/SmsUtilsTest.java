package io.lauriePraise.smsscheduler.utils;

import static org.junit.jupiter.api.Assertions.*;

import com.google.i18n.phonenumbers.NumberParseException;
import org.junit.jupiter.api.Test;

/** Created by Puadi on , 2022 */
class SmsUtilsTest {

  @Test
  void isPhoneNumberValid() {
    assertTrue(SmsUtils.isPhoneNumberValid("07701082252"));
    assertTrue(SmsUtils.isPhoneNumberValid("+447712098932"));
    assertTrue(SmsUtils.isPhoneNumberValid("7702082341"));
  }

  @Test
  void isPhoneNumberInvalid() throws Exception {
    assertFalse(SmsUtils.isPhoneNumberValid("+4477020933521"));
    assertFalse(SmsUtils.isPhoneNumberValid("077020933521"));
    assertFalse(SmsUtils.isPhoneNumberValid("+477702082252"));
    assertFalse(SmsUtils.isPhoneNumberValid("702082362"));
    assertThrows(
        Exception.class,
        () -> {
          SmsUtils.isPhoneNumberValid(null);
        });
  }
}
