package com.hkjava.demo.demofinnhub.infra;

import lombok.Getter;

@Getter
public enum Code {
  OK(20000, "OK"),
  // 40000 - 49999
  NOTFOUND(40000, "Resource NOT FOUND."), //
  JPH_NOTFOUND(40001, "JsonPlaceHolder RestClientException."), //
  FINNHUB_PROFILE2_NOTFOUND(40002,
      "Finnhub Company Profile2 RestClientException."), //
  FINNHUB_QUOTE_NOTFOUND(40003, "Finnhub Stock Quote RestClientException."), //
  FINNHUB_EXCHANGE_NOTFOUND(40004, "Finnhub Exchange RestClientException."), //
  // Server
  SERVER_TIMEOUT(50000, "Server Timeout."), //
  THIRD_PARTY_SERVER_UNAVAILABLE(50001, "Third Party Service Unavailable."), //
  // RuntimeException: 90000 - 99999
  IAE_EXCEPTION(90000, "Illegal Argument Exception."), //
  ENTITY_NOTFOUND(90001, "Entity Not Found."),
  ;

  private int code;
  private String desc;

  private Code(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public static Code fromCode(int code) {
    for (Code c : Code.values()) {
      if (c.code == code) {
        return c;
      }
    }
    throw new IllegalArgumentException();
  }

}
