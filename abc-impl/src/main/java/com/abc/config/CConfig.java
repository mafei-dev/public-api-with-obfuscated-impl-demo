package com.abc.impl;

import com.abc.impl.persistence.TransactionMapper;
import com.abc.impl.service.TransactionServiceImpl;
import org.springframework.context.annotation.Import;

@Import({
        TransactionMapper.class,
        TransactionServiceImpl.class,
})
public class CConfig {

}
