package com.xam.domain;

public class HelloWorld {
      public static final String HELLO_MSG = "Hello World!!!!";
      public String quote;
    public String getQuote() {
        return quote;
    }
    public HelloWorld(String quote) {
        this.quote = quote;
    }
    public String getMessage() {
        return HELLO_MSG;
    }
}
