package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import test_app.Page;

/**
 * Created by asadreev on 5/24/16.
 */
public class PageTests {

    Page page2 = new Page();

    @BeforeMethod
        public void precondition(){
        System.out.println("Preconditions:");
        page2.setUrl("New URL");
    }

    @Test(description = "First test of page constructor",  enabled = true)
    public void testPage1(){
        Page page1 = new Page();
        String url = page1.getURL();
        Assert.assertEquals(1,1);
        Assert.assertEquals(url, "", "Object Page has wrong url - " + url);
    }

    @Test(description = "First test of set Method",  enabled = true)
    public void testPage2(){
        String url = page2.getURL();
        Assert.assertEquals(url, "New URL", "The set method does not work");
    }




}
