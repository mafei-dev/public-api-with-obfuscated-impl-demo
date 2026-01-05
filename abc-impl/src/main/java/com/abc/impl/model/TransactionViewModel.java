package com.abc.impl.model;

import org.abc.api.model.TransactionView;

public class TransactionViewModel implements TransactionView {
    private String transactionId;
    private double amount;
    @Override
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
