package TestCases;

import commonactions.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import testdata.AppLevelData;
import testdata.LoginPageData;

import javax.swing.text.Utilities;
import java.util.List;

public class _1Registration {
    static By myAccountIcon = By.xpath("//i[@class='fa fa-user']");
    static By registerLink = By.xpath("//a[text()='Register']");
    static By firstNameTextBox = By.id("input-firstname");
    static By lastNameTextBox = By.id("input-lastname");
    static By emailTextBox = By.name("email");
    static By telephoneTextBox = By.name("telephone");
    static By passwordTextBox = By.id("input-password");
    static By confirmPasswordTextBox = By.id("input-confirm");
    static By yesRadioButton = By.xpath("//input[@value=1 and @name='newsletter']");
    static By checkbox = By.name("agree");
    static By continueButton = By.id("submitbtn");
    static By countries = By.xpath("//select[@id='input-country']/option");
    static By subscriptionDdl = By.name("subscription");
    public static void main(String[] args) {
        ReusableMethods rm;
        //1- Open the browser
        WebDriver driver = utilities.LaunchBrowser.openBrowser(AppLevelData.BROWSER_TYPE);
        rm = new ReusableMethods(driver);
        //2- Enter the url
        driver.get(AppLevelData.URL);
        //3- Click on My Account icon
        rm.doClick(myAccountIcon);
        //4-   Click on Register Link
        rm.doClick(registerLink);
        //5- Fill the registration form
        rm.doSendKeys(firstNameTextBox, "Tony");
        rm.doSendKeys(lastNameTextBox, "Roger");
        rm.doSendKeys(emailTextBox, "tony.roger@janbask.com");
        rm.doSendKeys(telephoneTextBox, "34534535");
        WebElement countryDdl = driver.findElement(By.name("country_id"));
        rm.doSelectValueFromDdl(countries, "India");
        rm.doSendKeys(passwordTextBox, "test@1234");
        rm.doSendKeys(confirmPasswordTextBox, "test@1234");
        rm.doClick(yesRadioButton);
        rm.doSelectValueFromDdlUsingVisibleText(subscriptionDdl, "Monthly");
        rm.doClick(checkbox);
        rm.doClick(continueButton);
        String expectedRegisterPageTitle = driver.getTitle(); //Register Account
        rm.doValidateStatus(expectedRegisterPageTitle);
    }
}

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