import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GettingStarted {

    @Test
    public void testDemoWebshop() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        WebElement element2 = driver.findElement(By.className("search-box-text"));
        element2.sendKeys("laptop");
        //Thread.sleep(3000);
        element2.submit();
        //WebElement element3 = driver.findElement(By.className("search-box-button"));
        //element3.click();

        Thread.sleep(3000);

        WebElement element4 = driver.findElement(By.partialLinkText("Laptop"));
        String actual = element4.getText();

        String expected = "14.1-inch Laptop";
        assertEquals(expected, actual);

        driver.quit();

    }

    @Test
    public void testRegisterDemoWebshop() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");

        Thread.sleep(1000);
        By by = By.id("gender-female");
        WebElement gender = driver.findElement(by);
        gender.click();

        Thread.sleep(1000);
        WebElement first = driver.findElement(By.name("FirstName"));
        first.sendKeys("Staffan");

        Thread.sleep(1000);
        WebElement last = driver.findElement(By.id("LastName"));
        last.sendKeys("Åberg");

        Thread.sleep(1000);
        WebElement email = driver.findElement(By.id("Email"));
        double random = Math.random();
        String mail = "a" +random +"@mail.com";
        //String mail = "a261124.1422@mail.com";
        email.sendKeys(mail);

        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("MitthemligaOrd123!");

        Thread.sleep(1000);
        WebElement confirm = driver.findElement(By.id("ConfirmPassword"));
        confirm.sendKeys("MitthemligaOrd123!");


        Thread.sleep(1000);
        WebElement register = driver.findElement(By.id("register-button"));
        register.click();

        Thread.sleep(1000);
        WebElement account = driver.findElement(By.className("account"));
        WebElement registerText = driver.findElement(By.tagName("h1"));
        WebElement result = driver.findElement(By.className("result"));

        String actual1 = account.getText();
        String actual2 = registerText.getText();
        String actual3 = result.getText();

        String expected1 = mail;
        String expected2 = "Register";
        String expected3 = "Your registration completed";

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);

        String number = "10.00";
        double number2 = Double.parseDouble(number);
        System.out.println(number2/3);

        //if(number2>=10)


    }


}