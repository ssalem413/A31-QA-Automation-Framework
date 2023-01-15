package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 {

    @Test
    public void Navigation(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "http://bbb.testpo.io/";
        driver.get(url);

        WebElement regLink = driver.findElement(By.cssSelector("[id='hel']"));
        regLink.click();

        String regUrl = "http://bbb.testpro.io/registration.php";
        Assert.assertEquals(driver.getCurrentUrl(), regUrl);

        driver.quit();
    }
}
