package pom;

import commonactions.ReusableMethods;
import org.openqa.selenium.WebDriver;
import testdata.AppLevelData;
import testdata.LoginPageData;

public class MyAccount {

    WebDriver driver;
    ReusableMethods rm;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        rm = new ReusableMethods(driver);
    }

    public void validateLoginStatus() {
        rm.doValidateStatus("My Account");
    }
}
