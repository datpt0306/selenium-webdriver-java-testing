package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_06_WebBrowser_Commands {

    WebDriver driver;
    @BeforeClass
    public void InitialBrowser() {
        //Run with browser (local)
        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver = new SafariDriver();
        //Run with Remote (Grid/ Docker/ Cloud Testing)


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void TC_01_(){
        // Open URL (Start with http or https)
       // driver.get();
        // Close browser at active tab/window
        driver.close();
        // Close browser with all tabs/window
        driver.quit();
        // Get page title
        driver.getTitle();
                

    }
    @Test
    public void TC_02_(){

    }

    @AfterClass
    public void cleanBrowser(){
        driver.quit();

    }
}
