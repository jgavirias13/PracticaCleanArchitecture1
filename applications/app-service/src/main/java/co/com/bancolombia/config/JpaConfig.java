package co.com.bancolombia.config;

import co.com.bancolombia.jpa.config.DBSecret;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class JpaConfig {

    @Bean
    public DBSecret dbSecret(Environment env) {
        return DBSecret.builder()
                .url(env.getProperty("spring.datasource.url"))
                .username(env.getProperty("spring.datasource.username"))
                .password(env.getProperty("spring.datasource.password"))
                .build();
    }
}
