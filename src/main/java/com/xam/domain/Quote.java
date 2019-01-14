package com.xam.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Quote  {
    private String author;
    private String quotation;

    public Quote() {
    }

    public Quote(String author, String quotation) {
        this.author = author;
        this.quotation = quotation;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getQuotation() {
        return quotation;
    }
    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }
    @Override
    public String toString() {
        return "Quote{" +
                "author='" + author + '\'' +
                ", quotation='" + quotation + '\'' +
                '}';
    }
}
