package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_Examples {
    /*
   Browser'ı açıp maximize yapın
   Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
   Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
   Amazon sayfasına geri dönün
   Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
   Sayfanın konumunu ve boyutunu yazdırın
   Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
   İstediğiniz şekilde olup olmadığını test edin
   Sayfayı kapatın
    */
    public static void main(String[] args) {

//  Browser'ı açıp maximize yapın
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver= new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
//   üm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//   Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");
//   Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();

        //   Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        String actualUrl =driver.getCurrentUrl();// asıl url
        String expectedUrl="https://www.amazon.com/";// beklenen url

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url Testi Passed");
        }else{
            System.out.println("Url Testi Failed");



        }

//   Sayfanın konumunu ve boyutunu yazdırın
        System.out.println(" SAYFA KONUM="+driver.manage().window().getPosition());
        System.out.println(" SAYFA BOYUT="+driver.manage().window().getSize());
//   Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        driver.manage().window().setPosition(new Point(50,50));
    driver.manage().window().setSize(new Dimension(600,600));


        System.out.println(" SAYFA yeni KONUM="+driver.manage().window().getPosition());
        System.out.println(" SAYFA  yeni BOYUT="+driver.manage().window().getSize());
        //   İstediğiniz şekilde olup olmadığını test edin

        Point actualPosition=driver.manage().window().getPosition();
        if (actualPosition.getX()==50 && actualPosition.getY()==50) {
            System.out.println("konum testi PASSED");}
        else {
            System.out.println("konum testi FAILED");
             }
Dimension actualDimension = driver.manage().window().getSize();
        if (actualDimension.getWidth()==600 && actualDimension.getHeight()==600){
            System.out.println("boyut testi PASSED");
        }else {
            System.out.println("boyut testi FAILED");}


//   Sayfayı kapatın

driver.close();
}}
