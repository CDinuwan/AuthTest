package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AfterLoginPage {
    private WebDriver driver;
    public By titleAfterLogin=By.className("info-account");

    public AfterLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){
        String title=driver.findElement(titleAfterLogin).getText();
        return title;
    }
}
