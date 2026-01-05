package org.stacksaga.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@StackSagaIdentifier
@Service
public @interface SagaExecutor {
    /**
     * @return which is the service that related for this executor.
     */
    String executeFor();

    /**
     * @return The bean name of the executor. This is used as the bean name,
     * and also this is used as the executor name for the StackSaga engine.
     * If you want to change the class name, due to some reason, you can do it in StackSaga without changing this name.
     * <b>This name cannot change time to time after using for the StackSaga</b>
     */
    @AliasFor(annotation = Component.class)
    String value();
}
