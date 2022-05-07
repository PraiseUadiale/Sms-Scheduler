package io.lauriePraise.smsscheduler.utils;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import lombok.extern.slf4j.Slf4j;

/** Created by Puadi on April, 2022 */
@Slf4j
public class SmsUtils {

  private SmsUtils() {}

  private static final String DEFAULT_REGION = "GB";

  public static boolean isPhoneNumberValid(String phoneNumber) {
    PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
    PhoneNumber phone = null;
    try {
      phone = phoneUtil.parse(phoneNumber, DEFAULT_REGION);

    } catch (NumberParseException e) {
      log.error("Error parsing phone number", e);
    }

    return phoneUtil.isValidNumberForRegion(phone, DEFAULT_REGION);
  }
}
