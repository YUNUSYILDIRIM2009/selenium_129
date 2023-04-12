package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        // amazon sayfasina gidin
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //search bolumunu locate edip "tablet"aratalim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("tablet");
        //aramaKutusu.sendKeys("tablet"+Keys.ENTER); bu sekılde tablet yazıp enter yapmıs oluyoruz
        aramaKutusu.submit();// Enter'a bas
        // arama sonuc yazisinda Tablet yazisini locate edip konsola yazdırın
       WebElement aramaSonucu = driver.findElement(By.className("sg-col-inner"));
        System.out.println("arama sonucu:"+aramaSonucu.getText());
       // sayfayi kapatin
driver.close();
    }
}
