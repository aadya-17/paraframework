package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static WebDriver driver;

    // Returns driver object
    public static WebDriver getDriver() {
        return driver;
    }

    // Setup = initialize browser
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // TearDown = close browser
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}