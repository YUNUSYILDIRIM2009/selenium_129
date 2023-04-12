package day_03_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C05_Allert {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void afterClass() throws Exception {
     // driver.close
    }

    @Test
    public void name() throws InterruptedException {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);

        //customer id kısmına 53920 yazın
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53290");
        Thread.sleep(2000);

        //submit butonuna tıklayın
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        //cıkan alert mesajını yazdırın
        String alertYazisi=driver.switchTo().alert().getText();
        System.out.println("Alert yazisi:"+alertYazisi);
        Thread.sleep(2000);
        //alerti kabul edin
        driver.switchTo().alert().accept();
        //cıkan 2. alert mesajını yazdırın
          String alertYazisi2=driver.switchTo().alert().getText();
        System.out.println("Alert yazisi 2:"+alertYazisi2);
        Thread.sleep(2000);
        //cıkan 2. alerti kabul edin
        driver.switchTo().alert().accept();

    }
}
