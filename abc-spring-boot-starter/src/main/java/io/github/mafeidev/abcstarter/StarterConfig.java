package io.github.mafeidev.abcstarter;

import org.abc.impl.config.CConfig;
import org.springframework.context.annotation.Import;

/**
 * * <h1>ABC Spring Boot Starter Configuration</h1>
 *
 */
@Import(CConfig.class)
public class StarterConfig {

    /**
     * * <h2>Default Constructor</h2>
     *
     */
    public StarterConfig() {
    }
}
