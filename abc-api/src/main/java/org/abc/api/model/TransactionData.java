package org.abc.api.model;

public interface TransactionData {

    void setTransactionId(String transactionId);

    String getTransactionId();

    void setAmount(double amount);

    double getAmount();
}
