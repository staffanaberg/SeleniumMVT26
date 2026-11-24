import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Login {

    @Test
    public void testDemoWebshop() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");

        Thread.sleep(1000);
        //Email
        driver.findElement(By.id("Email")).sendKeys("sabe@mail.com");

        Thread.sleep(1000);
        //Password, MitthemligaOrd123!
        driver.findElement(By.id("Password")).sendKeys("MitthemligaOrd123!");
        Thread.sleep(1000);
        //class, login-button
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(1000);
        String actual = driver.findElement(By.className("account")).getText();
        String expected = "sabe@mail.com";

        assertEquals(expected, actual);

        driver.findElement(By.className("ico-logout")).click();

        String actual2 = driver.findElement(By.className("ico-register")).getText();
        String expected2 = "Register";

        assertEquals(expected2, actual2);

        driver.quit();




    }

}
