import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Books {

    @Test
    public void testDemoWebshop() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        Thread.sleep(1000);
        //klicka på books
        WebElement books = driver.findElement(By.linkText("Books"));
        books.click();

        Thread.sleep(1000);
        //hämta actual price
        /*List<WebElement> prices = driver.findElements(By.className("actual-price"));
        for(int i=0; i< prices.size(); i++) {
            double price1 = Double.parseDouble(prices.get(i).getText());
            System.out.println(price1);
            assertTrue(price1>0 && price1<=50);
        }*/

        WebElement price = driver.findElement(By.className("actual-price"));
        double price1 = Double.parseDouble(price.getText());
        assertTrue(price1>0 && price1<=50);

        WebElement price02 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[1]/span[2]"));
        double price2 = Double.parseDouble(price02.getText());
        assertTrue(price2>0 && price2<=50);
        //kontrollera om priset är mellan 0-50

    }

}
