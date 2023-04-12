package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

            WebDriver driver= new EdgeDriver();// bos bir browser actık
            driver.get("https://google.com");    // gitmek istedigimiz sayfayi acar

        System.out.println("sayfa basligi"+driver.getTitle());// sayfa basligini getirir
        System.out.println("sayfa adresi"+driver.getCurrentUrl()); //sayfanin adresini getirir
        System.out.println("sayfa kodlari"+driver.getPageSource());// sayfa kaynak kodlarini getirir
        System.out.println(driver.getWindowHandle());// sayfanin hash degerini getirir
        // bu hash degerleri ile baska sayfadan bu sayfaya dierekt donebilmeyi saglar
        // yani sayfalar arasi gecis

    }
}
