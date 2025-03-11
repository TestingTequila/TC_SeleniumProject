import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testdata.AppLevelData;
import testdata.LoginPageData;
import utilities.LaunchBrowser;

public class _3Login_HandlingBrowsers {
    public static void main(String[] args) throws InterruptedException {
//        1- Open the browser
        WebDriver driver = LaunchBrowser.openBrowser(AppLevelData.BROWSER_TYPE);

//        2- Enter the url
        LaunchBrowser.enterUrl(AppLevelData.URL);

//        3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        Thread.sleep(1000);

//        4- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
//        5- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(LoginPageData.EMAIL_ID);

//        6- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(LoginPageData.PASSWORD);

//        7- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

//        8- Validate Login status
        String expectedPageTitle = LoginPageData.EXPECTED_PAGE_TITLE;
        String actualPageTitle = driver.getTitle();
        if (expectedPageTitle.equals(actualPageTitle)) {
            System.out.println(LoginPageData.LOGIN_SUCCESS_MESSAGE);
        } else {
            System.out.println(LoginPageData.LOGIN_FAILURE_MESSAGE);
        }

//        9- Close the browser
        LaunchBrowser.closeBrowser();


    }
}
