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
    public void customInit(){
        System.out.println("##customInit: The HelloWorld Bean has been initialized!");
    }
    public void customDestroy(){
        System.out.println("##customDelete: The HelloWorld Bean has been terminated!");
    }
}
