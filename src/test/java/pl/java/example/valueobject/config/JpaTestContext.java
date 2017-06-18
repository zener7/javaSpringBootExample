package pl.java.example.valueobject.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * The spring context for database integration test.
 *
 * @author ngraczykowski
 */
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan(basePackages={"pl.java.example.valueobject"})
@EnableJpaRepositories(basePackages={"pl.java.example.valueobject"})
public class JpaTestContext {
 
}
