import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindElementByLinkText {
    public static void main(String[] args)  {

        System.setProperty("webdriver.gecko.driver","/Users/alikiyancicek/Dev/WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        // wait for the element 10 seconds before telling us I can not find the element .
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseURL = "https://letskodeit.teachable.com/";
        driver.get(baseURL);

        //find element by link text ( basically link name shown on the website. such as button name)
        driver .findElement(By.linkText("Login")).click();

        // find element by Partial link text
        driver.findElement(By.xpath("Pract")).click();

    }
}
