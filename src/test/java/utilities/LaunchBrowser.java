package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
    static WebDriver driver;

    public static WebDriver openBrowser(String browserType) {
        if (browserType.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserType.equals("Edge")) {
            driver = new EdgeDriver();
        } else if (browserType.equals("IE")) {
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Please enter a valid browser name...");
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void enterUrl(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.close();
    }
}
