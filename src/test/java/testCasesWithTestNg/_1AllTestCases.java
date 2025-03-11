package testCasesWithTestNg;

import commonactions.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.AccountLogin;
import pom.MyAccount;
import pom.YourStore;
import testdata.AppLevelData;
import testdata.LoginPageData;

public class _1AllTestCases {
    WebDriver driver;
    ReusableMethods rm;
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
    @BeforeMethod
    public void openBrowserAndEnterUrl() {
        driver = utilities.LaunchBrowser.openBrowser(AppLevelData.BROWSER_TYPE);
        driver.get(AppLevelData.URL);
        rm = new ReusableMethods(driver);
    }
    @Test
    public void login1() {
        AccountLogin al = new YourStore(driver).clickOnMyAccountIcon().clickOnLoginLink();
        al.enterCredentials(LoginPageData.EMAIL_ID, LoginPageData.PASSWORD);
        MyAccount ma = al.clickOnLoginButton();
        ma.validateLoginStatus();
    }
    @Test
    public void login2() {
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();
        AccountLogin al = ys.clickOnLoginLink();
        al.enterCredentials(LoginPageData.EMAIL_ID, LoginPageData.PASSWORD);
        MyAccount ma = al.clickOnLoginButton();
        ma.validateLoginStatus();
    }
    @Test
    public void login3() {
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();
        AccountLogin al = ys.clickOnLoginLink();
        al.enterCredentials(LoginPageData.EMAIL_ID, LoginPageData.PASSWORD);
        MyAccount ma = al.clickOnLoginButton();
        ma.validateLoginStatus();
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
    @Test
    public void registration() {
        rm.doClick(myAccountIcon);
        rm.doClick(registerLink);
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
        String expectedRegisterPageTitle = driver.getTitle();
        rm.doValidateStatus(expectedRegisterPageTitle);
    }

}
