package com.meshal.account.bo;

public class Stock {
    private String item;
    private Long quantity;


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
