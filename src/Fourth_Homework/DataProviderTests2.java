package Fourth_Homework;

/**
 * Created by asadreev on 6/2/16.
 */

import Third_Homework.Calculus;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTests2 {

    @DataProvider

    public Object[][] Addition12() throws Exception{



        //Object[][] testObjArrayAddition =  newObject[][] { {2, 2 ,4},{3, 2 ,5}, {2, 3 ,5}, {3, 3 ,6}, {3, 4 ,7}, {2, 2 ,4}, {2, 2 ,4}, {2, 2 ,4},
         //       {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
          //      {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
           //     {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
            //    {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4}};



        Object[][] testObjArrayAddition = ExcelUtils.getTableArray("/Users/asadreev/IdeaProjects/QA_Automation_1/src/TestData/TestDataForSum.xlsx","Sheet1");

        return (testObjArrayAddition);

    }


    @Test(dataProvider = "Addition12" )

    public void test(int a, int b, int c) throws InterruptedException {

        int actualResult = Calculus.add12(a, b);
        int expectedResult = c;
        Assert.assertEquals(actualResult, expectedResult, "Addition method failed");
        Thread.sleep(1000);
    }
}
