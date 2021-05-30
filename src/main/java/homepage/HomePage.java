package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By clickLink=By.className("login");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage setClickLogin(){
        driver.findElement(clickLink).click();
        return new LoginPage(driver);
    }
}
