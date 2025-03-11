package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGConceptsAssertions {

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
        Assert.assertFalse(isAvailable());
    }
    public boolean isAvailable()
    {
        return true;
    }

}
//priority: negative>default>Positive