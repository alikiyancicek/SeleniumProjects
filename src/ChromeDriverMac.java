import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class ChromeDriverMac {

    public static void main(String[] args) {

        // if we copy drivers into the /usr/local/bin directory, we do not have to write line 16.
        // if the driver changed, we need to copy and paste new driver for this location.

        // specifying location of driver in our local machine
        System.setProperty("webdriver.chrome.driver","/Users/alikiyancicek/Dev/WebDrivers/chromedriver");

        // initialization of new chromedriver
        WebDriver driver = new ChromeDriver();

        // specifying the url that we wanted to open
        String baseURL = "https://letskodeit.teachable.com/";

        // maximize webpage maximum size
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //opening the specified URL on the specified browser
        driver.get(baseURL);

        //find element and click it. - this element was log in page button.
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();

        // find email login (input)) by xpath  and fill it with email.
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ali@gmail.com");

        // send password information via the same method
        driver.findElement(By.name("password")).sendKeys("123456");

        //find element and click it. - this element was log in button.
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();

    }
}
