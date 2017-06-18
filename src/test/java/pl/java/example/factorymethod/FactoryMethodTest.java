package pl.java.example.factorymethod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.java.example.factorymethod.config.FactoryMethodTestContext;
import pl.java.example.factorymethod.service.DiskService;

/**
 * @author ngraczykowski
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FactoryMethodTestContext.class)
public class FactoryMethodTest {

    @Autowired
    private DiskService diskService;
    
    @Test
    public void test() {
        diskService.play("cd");
        diskService.play("dvd");
    }
}
