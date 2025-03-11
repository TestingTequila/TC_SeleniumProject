package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGConceptsAssertionSAndH {

    public int sum(int a, int b) {
        return a + b;
    }

    @Test
    public void testTotal1()
    {
        Assert.assertNotEquals(sum(12,8), 20);//Fail
    }

    @Test
    public void testTotal2()
    {
        Assert.assertNotEquals(sum(12,8), 22);//True
    }

    @Test
    public void check()
    {
        SoftAssert sa = new SoftAssert();
        sa.assertFalse(isAvailable());//
        System.out.println("This will be printed or not");
        sa.assertAll();
    }
    public boolean isAvailable()
    {
        return true;
    }

}
//priority: negative>default>Positive