package org.demo.abcspringbootstartertest;

import org.abc.api.test.model.TransactionView;
import org.abc.api.test.service.TransactionService;
import org.abc.impl.test.config.CConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(CConfig.class)
@SpringBootApplication
public class AbcSpringBootStarterTestApplication implements CommandLineRunner {

    private final TransactionService transactionService;
    private final CConfig cConfig;

    public AbcSpringBootStarterTestApplication(TransactionService transactionService, CConfig cConfig) {
        this.transactionService = transactionService;
        this.cConfig = cConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(AbcSpringBootStarterTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        List<TransactionView> allTransactions = this.transactionService.getAllTransactions();
//        System.out.println("allTransactions = " + allTransactions);
    }
}
