import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeUsingCSSSelector {
    public static void main(String[]args){
    // if we copy drivers into the /usr/local/bin directory, we do not have to write line 16.
    // if the driver changed, we need to copy and paste new driver for this location.
    // specifying location of driver in our local machine
        System.setProperty("webdriver.chrome.driver","/Users/alikiyancicek/Dev/WebDrivers/chromedriver");
    // initialization of new chromedriver
        WebDriver driver = new ChromeDriver();
    // specifying the url that we wanted to open
        String baseURL = "https://sso.teachable.com/secure/42299/identity/login/password?wizard_id=EnETuaXBo9lK8pp7V10nbtwvmWiN0LXwYDEC2Lupsn__vsrCwxEsTxFm1D-zA6v7RcusX3QhEFv_9smt3kwvNA";
    // maximize webpage maximum size
        driver.manage().window().maximize();
    //implicit wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //opening the specified URL on the specified browser
        driver.get(baseURL);

        // # means ID selector
        // . means class selector for css
        //driver.findElement(By.id("input[id=\"email\"]")).click();

        //class
        // this code needs to modify
        driver.findElement(By.className("input[class='btn-primary']")).click();

    }
}