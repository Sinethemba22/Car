package org.sinethemba;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

//@RunWith(Arquillian.class)
public class CarTest {

    private Car carName = new Car("BMW");
    private Car carName2 = carName;
    private Car carName3 = new Car("BMW");
    private Car carName4 = new Car("Benz");

    String message = "This is a time out message";
    @Test
    public void getCarName() { //object equality

        assertEquals(carName2.getCarName(), carName.getCarName());
    }

    @Test
    public void testGetName() {//Object Identity


        if(carName == carName){
            //true
        }
        if (carName == carName2){
            //true
        }

        if (carName == carName3){
            //false
        }


    }
    @Test
    public void testGetAnimalName() {//fail test

        assertEquals(carName.getCarName(), carName4.getCarName());

    }

    @Test(timeout = 10)
    public void timeOutTest(){
        Car carMessage = new Car();
        carMessage.setMessage(message);

        System.out.println("Inside timeOutTest()");
        carMessage.getMessage();

    }
    @Ignore("Not ready for use  yet")
    @Test
    public void testingMethod(){

        System.out.println("This method is not ready");
    }


}




