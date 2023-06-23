package com.generate.invoice.model;

import java.util.List;

public class OrderModel {

    private String from;

    private String to;

    private int amount;

    private List<OrderEntryModel> entries;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public OrderModel(String from, String to, int amount,List<OrderEntryModel> entries) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.entries = entries;
    }

    public List<OrderEntryModel> getEntries() {
        return entries;
    }
}
