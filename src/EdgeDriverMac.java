import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgeDriverMac {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","/Users/alikiyancicek/Dev/WebDrivers/msedgedriver");
        WebDriver driver = new EdgeDriver();
        String baseURL = "https://letskodeit.com";
        driver.get(baseURL);

    }
}
