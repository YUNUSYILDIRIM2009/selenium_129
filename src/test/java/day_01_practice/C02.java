package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver= new EdgeDriver();
    // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

    // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);

    // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String tekonosaTitle=driver.getTitle();
        System.out.println("teknosaTitle:"+tekonosaTitle);

      String teknosaUrl=  driver.getCurrentUrl();
        System.out.println("teknosaUrl:"+teknosaUrl);

    // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (tekonosaTitle.contains("Teknoloji")) {
            System.out.println("Title Teknoloji iceriyor");
        }else {
            System.out.println("Title Teknoloji icermiyor");
        }

    // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaUrl.contains("teknosa")) {
            System.out.println("url teknosa iceriyor");
        }else{
            System.out.println("url teknosa iceriyor");

        }
    // "https://medunna.com/" adresine gidiniz
        driver.get("https:medunna.com/");
        Thread.sleep(2000);
    // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
       String medunnaTitle= driver.getTitle();
        System.out.println("medunna Title:"+medunnaTitle);

        String mudunnaUrl=driver.getCurrentUrl();
        System.out.println("medunna:"+mudunnaUrl);
    // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("title MEDUNNA iceriyor");}
        else {
            System.out.println("title MEDUNNA icermiyor");

        }

    // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (mudunnaUrl.contains("medunna")) {
            System.out.println("medunnaUrl medunna iceriyor ,tested pass");
        }else {
            System.out.println("medunnaUrl medunna icermiyor ,tested fail");
        }
    // teknosa adresine geri donunuz
        driver.navigate().back();

    // Sayfayı yenileyiniz
        driver.navigate().refresh();

    // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

    // Sayfayı yenileyiniz
        driver.navigate().back();
        Thread.sleep(2000);

    // pencereyi kapat
        driver.close();
}}
