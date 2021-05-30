package base;

import homepage.HomePage;
import homepage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cdinuwan\\Desktop\\WebAuto\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/");

        homePage=new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        System.out.println("Test is finished!");
        driver.quit();
    }
}
