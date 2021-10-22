package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class lcw {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();

        WebElement anladimbutton = driver.findElement(By.xpath("//*[@id=\"footer__container\"]/div[2]/div/p[3]/button"));
        anladimbutton.click();

        WebElement searchpantolon = driver.findElement(By.id("search_input"));
        searchpantolon.click();
        searchpantolon.sendKeys("pantolon");

        WebElement Ara = driver.findElement(By.xpath("//button[contains(text(),'Ara')]"));
        Ara.click();

        Thread.sleep(3000);

        WebElement dahafazla = driver.findElement(By.xpath("//*[@id=\"divModels\"]/div[7]/div/div[4]/a"));
        dahafazla.click();

        WebElement urunsecme = driver.findElement(By.xpath("//*[@id=\"model_658703_3836391\"]/div[1]/img[1]"));
        urunsecme.click();

        WebElement beden = driver.findElement(By.xpath("//*[@id=\"option-size\"]/a[2]"));
        beden.click();

        WebElement sepeteekle = driver.findElement(By.xpath("//*[@id=\"pd_add_to_cart\"]"));
        sepeteekle.click();

        Thread.sleep(3000);

        WebElement sepeteekle2 = driver.findElement(By.xpath("//*[@id=\"pd_add_to_cart\"]"));
        sepeteekle2.click();

        Thread.sleep(3000);

        WebElement sepetegit = driver.findElement(By.xpath("//*[@id=\"spanCart\"]"));
        sepetegit.click();

        WebElement sil = driver.findElement(By.id("Cart_ProductDelete_690411067"));
        sil.click();


    }

}
