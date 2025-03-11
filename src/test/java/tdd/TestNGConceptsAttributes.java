package tdd;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGConceptsAttributes {

    @Test(priority = 1, invocationCount = 10)
    public void registration() {
        System.out.println("@Test: This is registration Method");
    }

    @Test(priority = 2, groups = "smoke")
    public void login() {
        System.out.println("@Test: This is login Method");
    }

    @Test(priority = 3, groups = "smoke")
    public void addToCart() {
        System.out.println("@Test: This is addToCart Method");
        Assert.fail();
    }

    @Test(priority = -3, enabled = true, groups = "smoke")
    public void payment() {
        System.out.println("@Test: This is addToCart Method");
    }

    @Test(dependsOnGroups = "smoke", alwaysRun = true)
    public void contactUs() {
        System.out.println("@Test: This is addToCart Method");
    }
}
//priority: negative>default>Positive