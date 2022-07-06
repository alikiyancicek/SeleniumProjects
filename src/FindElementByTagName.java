import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementByTagName {

    public static void main(String[] args) {

        // not widely use because there is many same named tag names.like anchor tag, div tag etc.

        System.setProperty("webdriver.edge.driver","/Users/alikiyancicek/Dev/WebDrivers/msedgedriver");
        WebDriver driver = new EdgeDriver();
        String baseURL = "https://letskodeit.com";
        driver.get(baseURL);

        driver.findElement(By.tagName("a")).click();

    }
}
