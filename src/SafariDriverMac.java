import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverMac {
    public static void main(String[] args) {

        System.setProperty("webdriver.safari.driver","/Usr/bin/safaridriver");

        WebDriver driver = new SafariDriver();
        String baseURL = "https://letskodeit.com";
        driver.get(baseURL);


    }
}
