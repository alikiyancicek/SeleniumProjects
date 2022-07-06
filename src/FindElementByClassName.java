import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class FindElementByClassName {
    public static void main(String[] args) {

        //many elements have 2 or more class names . like;  btn-style class1.
        // that is why we need to be careful if we use class selectors.

        System.setProperty("webdriver.edge.driver","/Users/alikiyancicek/Dev/WebDrivers/msedgedriver");
        WebDriver driver = new EdgeDriver();
        String baseURL = "https  ://facebook.com";
        driver.get(baseURL);

        // this classname has 2 diffirent similar class name with other web elements on the page.
        // it is better to use xpath or css selector instead.
        //following line of code worked but needs to convert css selector or xpath for better results.
        driver.findElement(By.className("inputtext")).sendKeys("Automation");

    }

}
