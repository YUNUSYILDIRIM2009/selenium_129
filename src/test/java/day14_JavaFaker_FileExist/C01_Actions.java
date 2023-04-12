package day14_JavaFaker_FileExist;


import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C01_Actions extends TestBase {
    /*
    "https://techproeducation.com/" gidin
    İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
     */
    @Test
    public void actionsTest() {
//        "https://techproeducation.com/" gidin
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

//        İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.


    }
}
