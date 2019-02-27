package site.bulibucai.multiple; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.bulibucai.multiple.autoscancomponent.Car;
import site.bulibucai.multiple.bean.Apple;
import site.bulibucai.multiple.repository.AppleRepository;

/** 
* Main Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 27, 2019</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class MainTest {

    @Autowired
    private Apple apple;

    @Autowired
    private AppleRepository appleRepository;

    @Autowired
    private Car car;

    /**
     *
     * Method: main(String[] args) 
     * 
     */ 
    @Test
    public void testMain() {
        Assert.assertNotNull(apple);
        Assert.assertNotNull(appleRepository);
        Assert.assertNotNull(car);
    }


} 
