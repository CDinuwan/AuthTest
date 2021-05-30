package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField=By.id("email");
    private By passwordField=By.id("passwd");

    private By loginButton=By.id("SubmitLogin");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public AfterLoginPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new AfterLoginPage(driver);
    }
}
