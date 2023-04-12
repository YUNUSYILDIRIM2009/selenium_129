package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().getPosition();
        System.out.println("pencere konumu:"+driver.manage().window().getPosition());
        driver.manage().window().getSize();
        System.out.println("pencere olcusu:"+driver.manage().window().getSize());

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();
        driver.manage().window().getSize();
        System.out.println("fullscreen olcusu:"+driver.manage().window().getSize());
        driver.manage().window().getPosition();
        System.out.println("pencere konumu:"+driver.manage().window().getPosition());

        // sayfayi kapatiniz
    driver.close();
    }
}
