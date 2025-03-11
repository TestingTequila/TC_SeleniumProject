import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Registration_HandlingBrowsers {
    public static void main(String[] args) throws InterruptedException {
        //1- Open the browser
        WebDriver driver = utilities.LaunchBrowser.openBrowser("Chrome");

        //2- Enter the url
        utilities.LaunchBrowser.enterUrl("https://janbaskdemo.com/");

        //3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        Thread.sleep(1000);

        //4-   Click on Register Link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5- Fill the registration form
        WebElement firstNameTextBox = driver.findElement(By.id("input-firstname"));
        firstNameTextBox.sendKeys("Tek");

        WebElement lastNameTextBox = driver.findElement(By.id("input-lastname"));
        lastNameTextBox.sendKeys("Chand");

        WebElement emailTextBox = driver.findElement(By.name("email"));
        emailTextBox.sendKeys("tek.chand1@janbask.com");

        WebElement telephoneTextBox = driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys("6564645");

        WebElement countryDdl = driver.findElement(By.name("country_id"));
//        Select country = new Select(countryDdl);
        //country.selectByValue("99");
        //country.selectByVisibleText("India");
        //country.selectByIndex(106);
//        List<WebElement> countries = country.getOptions();
//        for (WebElement we : countries) {
//            String text = we.getText();
//            if (text.equals("India")) {
//                we.click();
//            }
//        }
        //countryDdl.click();
        List<WebElement> countries = driver.findElements(By.xpath("//select[@id='input-country']/option"));
        for (WebElement we : countries) {
            String text = we.getText();
            if (text.equals("India")) {
                we.click();
                break;
            }
        }

        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");

        WebElement confirmPasswordTextBox = driver.findElement(By.id("input-confirm"));
        confirmPasswordTextBox.sendKeys("test@1234");

        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value=1 and @name='newsletter']"));
        yesRadioButton.click();

        WebElement subscriptionDdl = driver.findElement(By.name("subscription"));
        Select subscription = new Select(subscriptionDdl);
        subscription.selectByVisibleText("Monthly");

        WebElement checkbox = driver.findElement(By.name("agree"));
        checkbox.click();

        String actualRegisterPageTitle = driver.getTitle(); //Register Account

        WebElement continueButton = driver.findElement(By.id("submitbtn"));
        continueButton.click();
        String expectedRegisterPageTitle = driver.getTitle(); //Register Account

        if (actualRegisterPageTitle.equals(expectedRegisterPageTitle)) {
            System.out.println("Email already Register...");
        } else {
            System.out.println("Registration Successful...");
        }

        utilities.LaunchBrowser.closeBrowser();
    }
}
