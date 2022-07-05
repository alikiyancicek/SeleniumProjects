import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverMac {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/alikiyancicek/Dev/WebDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://letskodeit.com";
        driver.get(baseURL);

    }
}
