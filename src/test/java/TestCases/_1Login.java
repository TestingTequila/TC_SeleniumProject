package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.AccountLogin;
import pom.MyAccount;
import pom.YourStore;
import testdata.AppLevelData;
import testdata.LoginPageData;

public class _1Login {
    public static void main(String[] args) {
//        1- Open the browser
        WebDriver driver = utilities.LaunchBrowser.openBrowser(AppLevelData.BROWSER_TYPE);

//        2- Enter the url
        driver.get(AppLevelData.URL);

//        3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

//        4- Click on login Link
        AccountLogin al = ys.clickOnLoginLink();

//        6- Enter correct credentials
        al.enterCredentials(LoginPageData.EMAIL_ID, LoginPageData.PASSWORD);

//        7- Click on Login button
        MyAccount ma = al.clickOnLoginButton();

//        8- Validate Login status
        ma.validateLoginStatus();

//        9- Close the browser
        driver.close();
    }
}
