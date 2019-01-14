package com.xam.domain;

public class HelloWorld {
    private Quote quote;
    public HelloWorld() {
    }
    public HelloWorld(Quote quote) {
        this.quote = quote;
    }
    public Quote getQuote() {
        return quote;
    }
    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
