import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverMac {
    public static void main(String[] args) {

            System.setProperty("webdriver.gecko.driver","/Users/alikiyancicek/Dev/WebDrivers/geckodriver");
            WebDriver driver = new FirefoxDriver();
            String baseURL = "https://letskodeit.com";
            driver.get(baseURL);

    }
}
