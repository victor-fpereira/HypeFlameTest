package engine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class General {

    private WebDriverWait wait;
    private static WebDriver driver = null;
    private final String chromeDriverPath = "C:\\Users\\victor.ferreira\\Documents\\workspace\\Hypeflame\\src\\resources\\chromedriver.exe";


    public void createDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeAllBrowsers() {
        driver.quit();
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }


}