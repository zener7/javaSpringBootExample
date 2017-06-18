package pl.java.example.factorymethod.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * The spring context for database integration test.
 *
 * @author ngraczykowski
 */
@Configuration
@ComponentScan(basePackages={"pl.java.example.factorymethod"})
public class FactoryMethodTestContext {
 
}
