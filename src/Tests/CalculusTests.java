package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import Third_Homework.Calculus;
import org.testng.annotations.DataProvider;

/**
 * Created by asadreev on 5/30/16.
 */
public class CalculusTests {

    @Test(description = "Sum of positive integers", enabled = true)
    public void testSum1(){
        Assert.assertEquals(Calculus.add12(1,1),2);
    }

    @Test(description = "Sum of negative and positive integer", enabled = true)
    public void testSum2(){
        Assert.assertEquals(Calculus.add12(-1,1),0);
    }

    @Test(description = "Sum of 0", enabled = true)
    public void testSum3(){
        Assert.assertEquals(Calculus.add12(0,0),0);
    }

    @Test (description = "Summ of negative numbers", enabled = true)
     public void testSum4(){
        Assert.assertEquals(Calculus.add12(-1,-2),-3);
    }

    //@Test (description = "Sum outside of int", enabled= false)
    //public void testSum5(){
     //   Assert.assertEquals(Calculus.add(-2147483646,-5),);
}
//}
