package org.abc.impl.service;

import org.abc.impl.persistence.TransactionMapper;
import org.abc.api.exception.InvalidTransaction;
import org.abc.api.model.TransactionData;
import org.abc.api.model.TransactionView;
import org.abc.api.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private static Logger log = LoggerFactory.getLogger(TransactionServiceImpl.class);

    private final TransactionMapper transactionMapper;

    @Autowired
    public TransactionServiceImpl(TransactionMapper transactionMapper) {
        this.transactionMapper = transactionMapper;
        log.info("TransactionServiceImpl instantiated");
    }

    @Override
    public void save(TransactionData transactionData) throws InvalidTransaction {

    }

    @Override
    public List<TransactionView> getAllTransactions() {
        return transactionMapper.getAllTransactions();
    }
}
