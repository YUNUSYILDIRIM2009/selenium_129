package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVELocaters {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        // amazon sayfasina gidin
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //search kutusunu locate edin
WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
/* bir web elementi locate etmek istersek önce sayfayi acip element üzerine sag tıklayıp
incele(inspect secenegini tikliyoruz .Karsimiza cikan HTML kodlarindan eşsiz olan (id)
locator olarak seciyoruz.==>
driver.findelement(By.id("idDegeri"));
 */
        //search kutusuna iphone aratin

aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
        //sayfadaki <input> ve <a> tag'larini sayisini yazdirin

        List<WebElement> inputList = driver.findElements(By.tagName("input"));
        System.out.println("input tag sayisi:"+inputList.size());
    List<WebElement> aTagList = driver.findElements(By.tagName("a"));
        System.out.println("a sayisi:"+ aTagList.size());
        //sayfayi kapatiniz

driver.close();
    }
}
