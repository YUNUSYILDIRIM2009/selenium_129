package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        Thread.sleep(2000);
        // ilk kutucuga 20 giriniz

        WebElement ilkkutucuk= driver.findElement(By.id("number1"));
        ilkkutucuk.sendKeys("20");
        Thread.sleep(2000);
        // ikinci kutucuga 30 giriniz
WebElement ikincikutucuk=driver.findElement(By.id("number2"));
ikincikutucuk.sendKeys("30");
        // calculate'e tıklayınız
      WebElement calculate=  driver.findElement(By.id("calculate"));
        calculate.click();
        Thread.sleep(2000);

        // sonucu yazdırınız
        WebElement sonuc =driver.findElement(By.id("answer"));
        System.out.println("sonuc:"+sonuc.getText());

        // sayfayi kapatiniz
    driver.close();
    }
}
