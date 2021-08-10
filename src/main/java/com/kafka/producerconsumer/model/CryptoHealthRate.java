package com.kafka.producerconsumer.model;


import lombok.Data;

@Data
public class CryptoHealthRate {
    private String symbol;
    private String rating;
    private String name;

    public CryptoHealthRate(String symbol, String name, String rating) {
        this.symbol = symbol;
        this.name = name;
        this.rating = rating;
    }
}
