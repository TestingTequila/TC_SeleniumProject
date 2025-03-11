package pom;

import commonactions.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class YourStore {
    WebDriver driver;
    ReusableMethods rm;

    public YourStore(WebDriver driver) {
        this.driver = driver;
        rm = new ReusableMethods(driver);
    }

    By myAccountIcon = By.xpath("//i[@class='fa fa-user']");
    By loginLink = By.xpath("//a[text()='Login']");

    public YourStore clickOnMyAccountIcon() {
        rm.doClick(myAccountIcon);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        return this;
    }

    public AccountLogin clickOnLoginLink() {
        rm.doClick(loginLink);
        return new AccountLogin(driver);
    }
}
