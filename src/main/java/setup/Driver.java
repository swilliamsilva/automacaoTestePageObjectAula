package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {


    public WebDriver Webdriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Usuario\\Caminhor\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.casasbahia.com.br");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
