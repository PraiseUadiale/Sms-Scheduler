package io.lauriePraise.smsscheduler.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * Created by Puadi on , 2022
 */
@Getter
@ToString
public class SMSRequest {

  //Validation to avoid null or empty values
  @NotBlank(message = "Phone Number must not be blank")
  private final String phoneNumber;

  @NotBlank(message = "message must not be blank")
  private final String message;

  //Annotation tellsApi what we are expecting
  public SMSRequest(  @JsonProperty("phoneNumber") String phoneNumber,
      @JsonProperty("message") String message) {
    this.phoneNumber = phoneNumber;
    this.message = message;
  }
}
