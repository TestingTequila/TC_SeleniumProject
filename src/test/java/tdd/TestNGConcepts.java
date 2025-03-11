package tdd;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGConcepts {

    @AfterSuite
    public void deleteDatabase() {
        System.out.println("@AfterSuite: This will delete the Database...");
    }

    @AfterTest
    public void disconnectToDatabase() {
        System.out.println("@AfterTest: This will disconnect to the Database...");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("@AfterClass: This will close the browser...");
    }

    @BeforeSuite
    public void createDatabase() {
        System.out.println("@BeforeSuite: This will create the Database...");
    }

    @BeforeTest
    public void connectToDatabase() {
        System.out.println("@BeforeTest: This will connect to the Database...");
    }

    @BeforeClass
    public void openBrowser() {
        System.out.println("@BeforeClass: This will open the browser...");
    }

    @BeforeMethod
    public void enterUrlInBrowser() {
        System.out.println("@BeforeMethod: This will enter url in Browser");
    }

    @AfterMethod
    public void removeUrlInBrowser() {
        System.out.println("@AfterMethod: This will remove url in Browser");
    }

    @Test
    public void addToCart() {
        System.out.println("@Test: This is addToCart Method");
    }

    @Test
    public void registration() {
        System.out.println("@Test: This is registration Method");
    }

    @Test
    public void login() {
        System.out.println("@Test: This is login Method");
    }
}
