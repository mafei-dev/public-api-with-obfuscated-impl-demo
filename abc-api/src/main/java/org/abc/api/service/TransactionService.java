package org.abc.api.service;

import org.abc.api.exception.InvalidTransaction;
import org.abc.api.model.TransactionData;
import org.abc.api.model.TransactionView;

import java.util.List;

/**
 * Service interface for managing transactions.
 *
 */
public interface TransactionService {

    /**
     * Save the transaction data
     *
     * @param transactionData the transaction data to save
     * @throws InvalidTransaction if the transaction data is invalid
     */
    void save(TransactionData transactionData) throws InvalidTransaction;

    /**
     * Get all transactions
     *
     * @return list of transaction views
     */
    List<TransactionView> getAllTransactions();

}
