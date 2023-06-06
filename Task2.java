package SeleniumHW_06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2  extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = " http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement getNewUserBtn = driver.findElement(By.xpath("//button[@id='save']"));
        getNewUserBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());
        driver.close();




    }
}
