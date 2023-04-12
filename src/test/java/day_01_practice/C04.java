package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        // https://www.amazon.com/ adresine gidin
        driver.get("https://amazon.com/");
        Thread.sleep(2000);

        // Kaynak Kodlarini konsola yazdiriniz
        String sayfaKaynakKodlari=driver.getPageSource();

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (sayfaKaynakKodlari.contains("GateWay")){
            System.out.println("kaynak kodlarinda Gateway yaziyor");}
        else {
            System.out.println("kaynak kodlarinda Gateway yazmiyor");}


        // sayfayi kapatiniz
    driver.close();
    }
}
