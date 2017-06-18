package pl.java.example.valueobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.java.example.valueobject.config.JpaTestContext;
import pl.java.example.valueobject.dao.PersonEntityDao;
import pl.java.example.valueobject.model.AddressData;
import pl.java.example.valueobject.model.PersonData;
import pl.java.example.valueobject.model.PersonEntity;

/**
 * @author ngraczykowski
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaTestContext.class)
@Rollback
@Transactional
public class ValueObjectTest {

    
    @Autowired
    private PersonEntityDao testDao;
    
    @Test
    public void test1() {
        // given
    	PersonEntity test = new PersonEntity();
        PersonData personData = PersonData.builder().name("TestName").age(33).build();
        PersonData personData3 = PersonData.builder().name("TestName").age(33).build();
        test.setPersonData(personData);
        testDao.saveAndFlush(test);

        // when
        List<PersonEntity> result = testDao.findAll();

        PersonData personData2 = result.get(0).getPersonData();
        // then
        assertThat(result.get(0).getPersonData().getAge(), is(33));
        assertThat(result.get(0).getPersonData().getName(), is("TestName"));
        assertThat(personData2, is(personData3));
    }
    @Test
    public void test2() {
        // given
        PersonEntity personEntity = new PersonEntity();
        PersonData personData = PersonData.builder().name("TestName").age(33).build();
        AddressData addressData = AddressData.builder().city("Łódz").streetNumber(11).build();
        AddressData addressData2 = AddressData.builder().city("Włocławek").streetNumber(21).build();
        personEntity.getAddressDatas().add(addressData);
        personEntity.getAddressDatas().add(addressData2);
        personEntity.setPersonData(personData);
        testDao.saveAndFlush(personEntity);
        // when
        List<PersonEntity> result = testDao.findAll();
        
        // then
        assertThat(result.get(0).getAddressDatas(), hasSize(2));
        assertThat(result.get(0).getAddressDatas().iterator().next().getCity(), is("Łódz"));
    }

}
