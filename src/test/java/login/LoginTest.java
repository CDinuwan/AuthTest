package login;

import base.BaseTests;
import homepage.AfterLoginPage;
import homepage.HomePage;
import homepage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTest extends BaseTests {

    @Test
    public void successfulLogin(){
        LoginPage loginPage=homePage.setClickLogin();
        loginPage.setUsernameField("scientology.gq@gmail.com");
        loginPage.setPasswordField("chanu31728839");
        loginPage.clickLoginButton();
        AfterLoginPage afterLoginPage=new AfterLoginPage(driver);
        assertTrue(afterLoginPage.getTitle().contains("Welcome to your account. Here you can manage all of your personal information and orders."),"Your loginTest isn't success.");
    }

}
