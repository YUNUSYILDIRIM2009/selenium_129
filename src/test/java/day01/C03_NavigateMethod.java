package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

            WebDriver driver= new EdgeDriver();
            // amazon sayfasina gidelim
//driver.get ile de aynı sekilde amazon sayfasine gidebiliz
driver.navigate().to("https://amazon.com");
        // techproeducation sayfasina gidelim
        // driver.get ile de aynı sekilde önce amazon' a oradanda techproeducation'a gider
        //driver.get ile yapildiginda farklı sayfalar acıyor.
        // navigate ile yapinca aynı sayfadan deveam ederek acıyor
        Thread.sleep(500);// aradaki gecis suresi ayarlanır.Girilen sure kadar bekler

        driver.navigate().to("https://techproeducation.com");
Thread.sleep(500);
driver.navigate().back();// onceki sayfaya geri dönmeyi saglar
        Thread.sleep(500);
        driver.navigate().forward();
        //sayfayi yenileyelim
        Thread.sleep(1500);
        driver.navigate().refresh();
        Thread.sleep(2000);
        // sayfay, kapat
        driver.close();

    }
}
