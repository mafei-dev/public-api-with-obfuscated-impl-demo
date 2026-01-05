package abc.impl.persistence;

import abc.impl.model.TransactionViewModel;
import org.abc.api.model.TransactionView;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionMapper {

    public List<TransactionView> getAllTransactions() {
        TransactionViewModel model1 = new TransactionViewModel();
        TransactionViewModel model2 = new TransactionViewModel();
        model1.setTransactionId("TXN1001");
        model1.setAmount(250.75);

        model2.setTransactionId("TXN1002");
        model2.setAmount(480.00);
        return List.of(
                model1,
                model2
        );
    }
}
