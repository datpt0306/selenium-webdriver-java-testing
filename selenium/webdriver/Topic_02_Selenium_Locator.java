package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Selenium_Locator {
    WebDriver driver;
    String fullName = "Selenium Locator";
    @BeforeClass
    public void InitialBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/register");
    }

    @Test
    public void TC_01_ID() throws InterruptedException {
        // tuong tac email address
        //dung 1 lan
       // driver.findElement(By.id("")).click();
        //dung nhieu lan
       /* WebElement emailTextbox = driver.findElement(By.id(""));
        emailTextbox.clear();
        emailTextbox.sendKeys();
        emailTextbox.isDisplayed(); */
    driver.findElement(By.id("small-searchterms")).sendKeys("Macbook");
    Thread.sleep(3000);
    driver.findElement(By.id("FirstName")).sendKeys("Automation");
    Thread.sleep(3000);
    }
    @Test
    public void TC_02_Class(){
        //khong lay het toan bo gia tri neu co khoang trang
        driver.findElement(By.className("register-next-step-button")).click();
    }
    @Test
    public void TC_03_name(){
        driver.findElement(By.name("LastName")).sendKeys("FC");

    }
    @Test
    public void TC_04_Linktext(){
        // chi lam viec voi element la link (hyper link)
        //the a va co thuoc tinh href
        // lay het toan bo text
        driver.findElement(By.linkText("Register"));

    }
    @Test
    public void TC_05_Partial_link_text(){
        //co the lay het toan bo text hoac mot phan
        driver.findElement(By.partialLinkText("Digital"));

    }
    @Test
    public void TC_06_Tagname(){
        // ten the giong html
        // muon tim tat ca element giong nhau
        //VD: tat ca cac textbox
        driver.findElements(By.tagName("button"));


    }
    @Test
    public void TC_07_CSS(){
        // co the cover het 6 loai tren
        driver.findElement(By.cssSelector("input[id ='Company']"));
        driver.findElement(By.cssSelector("#Company"));
        driver.findElement(By.cssSelector("input#Company"));

    }
    @Test
    public void TC_08_XPath(){
        driver.findElement(By.xpath("//input[@id ='Password']"));
        driver.findElement(By.xpath("//a[text() ='Register']"));
        driver.findElement(By.xpath("//a[contains(text(),'Digital')]"));

    }

    @Test
    public void TC_09_Relative_locator(){
        driver.get("https://demo.nopcommerce.com/login");
        //element A
        By passwordTextboxBy = By.cssSelector("input#Password");
        WebElement passwordTextbox = driver.findElement(By.cssSelector("input#Password"));

        //element B
        By rememberMeCheckboxBy = By.id("RememberMe");

        //element C
        By forgotPasswordLinkBy = By.cssSelector("span.forgot-password");
        //element D
        By loginButtonBy= By.cssSelector("button.login-button");
        //element E
        driver.findElement(RelativeLocator.with(By.tagName("label")).above(loginButtonBy));
        //label dang nam tren login button

        driver.findElement(RelativeLocator.with(By.tagName("label")).below(passwordTextboxBy));
        driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(rememberMeCheckboxBy));
        driver.findElement(RelativeLocator.with(By.tagName("label")).toLeftOf(forgotPasswordLinkBy));
        // khi khong the dinh danh duoc
        //dung de test GUI (giao dien)
    }
    @Test
    public void TC_10_xpath (){
        driver.get("https://live.techpanda.org/");
        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

    }




    @AfterClass
    public void cleanBrowser(){
        driver.quit();

    }
}
