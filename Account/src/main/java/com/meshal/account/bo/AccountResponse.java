package com.meshal.account.bo;

import java.util.List;

public class AccountResponse {
    List<Stock> stocks;


    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    @Override
    public String toString() {
        return "AccountResponse{" +
                "stocks=" + stocks +
                '}';
    }
}
