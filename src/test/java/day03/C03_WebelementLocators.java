package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C03_WebelementLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
                driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
driver.get("https://amamzon.com/");

        //Search(ara) “city bike”
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike"+ Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonucYazisi= driver.findElements(By.className("sg-col-inner"));
        System.out.println("sonucYazisi:"+sonucYazisi.get(0).getText());
        String [] sonucSayisi =sonucYazisi.get(0).getText().split(" ");// sonuc yazısını bosluklara boldum
        System.out.println("sonuc sayısı="+sonucSayisi[2]);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
List<WebElement>sonuclar=driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
        sonuclar.get(0).click();
    }
}
