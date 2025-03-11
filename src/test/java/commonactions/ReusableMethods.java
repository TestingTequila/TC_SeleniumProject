package commonactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class ReusableMethods {

    WebDriver driver;

    public ReusableMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By path) {
        WebElement webElement = path.findElement(driver);
        webElement.click();
    }

    public void doSendKeys(By path, String textToEnter) {
        WebElement passwordTextBox = driver.findElement(path);
        passwordTextBox.sendKeys(textToEnter);
    }

    public void doValidateStatus(String expectedPageTitle) {
        Assert.assertEquals(expectedPageTitle,driver.getTitle());
//        if (expectedPageTitle.equals(driver.getTitle())) {
//            System.out.println(successMessage);
//        } else {
//            System.out.println(failureMessage);
//        }
    }

    public void doSelectValueFromDdl(By path, String valueToSelect) {
        List<WebElement> ddlist = driver.findElements(path);
        for (WebElement we : ddlist) {
            String text = we.getText();
            if (text.equals(valueToSelect)) {
                we.click();
                break;
            }
        }
    }
    public void doSelectValueFromDdlUsingVisibleText(By path,String valueToSelect)
    {
        WebElement Ddl = driver.findElement(path);
        Select subscription = new Select(Ddl);
        subscription.selectByVisibleText(valueToSelect);
    }
}
