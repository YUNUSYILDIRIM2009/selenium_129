package day13_ActionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions01 extends TestBase {

/*
https://the-internet.herokuapp.com/context_menu  sitesine gidin
Kutuya sağ tıklayın
Alert'te cikan yazinin "You selected a context menu" oldugunu test edin
Tamam diyerek alert'i kapatın
 */


    @Test
    public void actionsTest() throws InterruptedException {

//https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
//Kutuya sağ tıklayın


        //1. adım action objesi olusturmalıyız
        Actions actions =new Actions(driver);

        //2. adım uzerınde işlem yapılacak web elementı locate etmek
        WebElement kutu =driver.findElement(By.id("hot-spot"));
Thread.sleep(3000);
        //3. adım işlemi uygulayın
        actions.contextClick(kutu).perform();
Thread.sleep(3000);

//Alert'te cikan yazinin "You selected a context menu" oldugunu test edin
        String alertYazisi =driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",alertYazisi);
        Thread.sleep(3000);
//Tamam diyerek alert'i kapatın
driver.switchTo().alert().accept();
    }


}
