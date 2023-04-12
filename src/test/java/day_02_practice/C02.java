package day_02_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.google.com/
        driver.get("https://google.com/");

        // sayfa baslıgının "Google" kelimesini icerdigini test edin
        String googleTitle= driver.getTitle();
       if (googleTitle.contains("Google")){
            System.out.println("Title Google iceriyor");
       }else {
           System.out.println("Title Google icermiyor");}


        // arama cubuguna "Nutella" yazıp aratın
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Nutella" + Keys.ENTER);

        // bulunan sonuc sayısını yazdırın
        WebElement sonucYazisi = driver.findElement(By.id("result-stats"));
        //System.out.println(sonucYazisi.getText());
       String arr[]= sonucYazisi.getText().split(" ");
       String sonuc=arr[1];
        System.out.println(sonuc);
        // sonuc sayısının 100000000  fazla oldugunu test edin
        String sonucc = sonuc.replaceAll("\\D","");
        System.out.println(sonucc);

        // sayfayı kapatın
        driver.close();
}}
