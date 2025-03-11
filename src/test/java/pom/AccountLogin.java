package pom;

import commonactions.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLogin {


    WebDriver driver;
    By emailTextBox = By.xpath("//input[@id='input-email']");
    By passwordTextBox = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@type='submit']");
    ReusableMethods rm;

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        rm = new ReusableMethods(driver);
    }

    public void enterCredentials(String emailId, String password) {

        rm.doSendKeys(emailTextBox, emailId);
        rm.doSendKeys(passwordTextBox, password);
    }

    public MyAccount clickOnLoginButton() {
        rm.doClick(loginButton);
        return new MyAccount(driver);
    }
}
