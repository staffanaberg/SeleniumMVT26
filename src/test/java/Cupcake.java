import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Cupcake {

    @Test
    public void testCupcake() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.torontocupcake.com/");

        //Klicka i Accept cookies (du kanske måste lägga till en Thread.sleep eller annan wait här)
        //class="cky-btn cky-btn-accept"
        //" -> '
        //class='cky-btn cky-btn-accept'
        //sätt hakparentes runt attributet
        //[class='cky-btn cky-btn-accept']
        //Lägg in i metoden By.cssSelector
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.cssSelector("[class='cky-btn cky-btn-accept']"));
        element1.click();
        Thread.sleep(2000);

        //Välj Order Now
        //aria-label="Order Now"
        //
        //" -> '
        //aria-label='Order Now'
        //sätt hakparentes runt attributet
        //[aria-label='Order Now']
        //Lägg in i metoden By.cssSelector
        //By.cssSelector("[aria-label='Order Now']")
        WebElement element2 = driver.findElement(By.cssSelector("[aria-label='Order Now']"));
        element2.click();
        Thread.sleep(2000);
        //Öka quantity på Chocolate Hazelnut Cupcake till 2
        //aria-labelledby="qty_ChocolateHazelnut"
        WebElement element3 = driver.findElement(By.cssSelector("[aria-labelledby='qty_ChocolateHazelnut']"));
        element3.clear();
        Thread.sleep(2000);
        element3.sendKeys("2");
        Thread.sleep(2000);
        //Välj Add to Cart för Chocolate Hazelnut Cupcake
        //aria-label="Add Chocolate Hazelnut cupcake to cart"
        WebElement element4 = driver.findElement(By.cssSelector("[aria-label='Add Chocolate Hazelnut cupcake to cart']"));
        element4.click();
        Thread.sleep(2000);
        //Verifiera titeln på sidan
        String expected = "Toronto Cupcake | Your Shopping Cart";
        String actual = driver.getTitle();

        assertEquals(expected, actual);


    }


}
