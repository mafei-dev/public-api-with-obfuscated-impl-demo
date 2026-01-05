package com.abc.config;

import com.abc.impl.persistence.TransactionMapper;
import com.abc.impl.service.TransactionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Import;

@Import({
        TransactionMapper.class,
        TransactionServiceImpl.class,
})
public class CConfig {
    private static Logger log = LoggerFactory.getLogger(CConfig.class);

    public CConfig() {
        log.info("CConfig instantiated");
    }
}
