import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverMac {

    public static void main(String[] args) {


        // if we copy drivers into the /usr/local/bin directory, we do not have to write line 14.
        // if the driver changed, we need to copy and paste new driver for this location.

        // specifing location of driver into our local machine
        System.setProperty("webdriver.chrome.driver","/Users/alikiyancicek/Dev/WebDrivers/chromedriver");

        // initialization of new chromedriver object
        WebDriver driver = new ChromeDriver();

        // specifiying the url that we wanted to open
        String baseURL = "https://letskodeit.com";

        //openning the specified URL on the specified browser
        driver.get(baseURL);

    }
}
