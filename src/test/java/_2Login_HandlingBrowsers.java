import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.LaunchBrowser;

public class _2Login_HandlingBrowsers {
    public static void main(String[] args) throws InterruptedException {
//        1- Open the browser
        WebDriver driver = LaunchBrowser.openBrowser("Firefox");

//        2- Enter the url
        utilities.LaunchBrowser.enterUrl("https://janbaskdemo.com/");

//        3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        Thread.sleep(1000);

//        4- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
//        5- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("jason.roger@janbask.com");

//        6- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@1234");

//        7- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

//        8- Validate Login status
        String expectedPageTitle = "My Account";
        String actualPageTitle = driver.getTitle();
        if (expectedPageTitle.equals(actualPageTitle)) {
            System.out.println("Login is Successful");
        } else {
            System.out.println("Login Failed...Please check your credentials...");
        }

//        9- Close the browser
        utilities.LaunchBrowser.closeBrowser();


    }
}
