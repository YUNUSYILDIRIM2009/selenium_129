package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver= new EdgeDriver();
        driver.get("https://google.com");
        driver.get("https://techproeducation.com");
        // sayfanin l-konumu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu"+ driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari"+driver.manage().window().getSize());
        Thread.sleep(2000);

        // sayfayi minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(2000);
        // sayfayi tam ekran yapar
        driver.manage().window().maximize();
        System.out.println("sayfanin konumu"+ driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari"+driver.manage().window().getSize());
// sayfayi full screen yapalim

    driver.manage().window().fullscreen();
    }}
