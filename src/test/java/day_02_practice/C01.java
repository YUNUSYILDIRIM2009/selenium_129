package day_02_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01 {

    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amamzon.com/");


        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        String actuelTagName = aramaKutusu.getTagName();

        String expectedTagName = "input";

        if(expectedTagName.equals(actuelTagName)){
            System.out.println("TagName input");
        }else{
            System.out.println("TagName input degil");
        }
     // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        String expectedNameDegeri = "field-keywords";

        if(expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attributenin degeri field keywords");
        }else {
            System.out.println("name attributenin degeri field keywords degil");
        }




        // sayfayi kapatiniz
        driver.close();

}}
