import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeUsingCSSSelector {
    public static void main(String[]args){

        // syntax for css selector tag[attribute='value']
        //example for CSSid selector--->input[id=displayed-text]
        //example for css class selector --->input[class=displayed-test]

    // if we copy drivers into the /usr/local/bin directory, we do not have to write line 16.
    // if the driver changed, we need to copy and paste new driver for this location.
    // specifying location of driver in our local machine
        System.setProperty("webdriver.chrome.driver","/Users/alikiyancicek/Dev/WebDrivers/chromedriver");
    // initialization of new chromedriver
        WebDriver driver = new ChromeDriver();
    // specifying the url that we wanted to open
        String baseURL = "https://courses.letskodeit.com/practice";
    // maximize webpage maximum size
        driver.manage().window().maximize();
    //implicit wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //opening the specified URL on the specified browser
        driver.get(baseURL);

        // # means ID selector
        // . means class selector for css
        //driver.findElement(By.id("input[id=\"email\"]")).click();

        // finds element by css selector and writes 123 inside
        driver.findElement(By.cssSelector("input[id='displayed-text']")).sendKeys("123");

    }
}