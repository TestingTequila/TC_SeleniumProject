package tdd;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProviders {

    @Test(dataProvider = "getData")
    public void registration(String name, int age) {
        System.out.println("Name: " + name + " and Age: " + age);
    }

    @DataProvider
    public Object[][] getData() {

        Object[][] data = {{"Ashish", 34}, {"Jason", 44}, {"Kerrie", 21}};
        return data;
    }
}


