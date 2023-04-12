package day09_DropDown_Alerts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_Alerts extends TestBase {
   /* https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
    Bir metod olusturun: acceptAlert
1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
    Bir metod olusturun: dismissAlert
2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
“successfuly” icermedigini test edin.
    Bir metod olusturun: sendKeysAlert
3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
    tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
            Collapse
*/
   @Test
   public void acceptAlert()throws Exception {
       // https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
       driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
       //    1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
       //    “You successfully clicked an alert” oldugunu test edin.
       driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
       Thread.sleep(4000);
       driver.switchTo().//Geçmek,Değiştirmek
               alert().//Alert'e geçiş yaptı
               accept();//Çıkan uyarıda OK yada TAMAM butonuna basar
       Thread.sleep(4000);
       String actualText = driver.findElement(By.xpath("//*[@id='result']")).getText();
       String expectedText = "You successfully clicked an alert";
       Assert.assertEquals(expectedText, actualText);
// bır method olusuturun :dismiss alert
//       2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
//“successfuly” icermedigini test edin.
//               Bir metod olusturun: sendKeysAlert
//       3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
//       tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
//
   }













   }
