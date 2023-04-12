package day09_DropDown_Alerts;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class C02_TestBaseDemo extends TestBase {
    @Test
    public void test01(){
        // techproeducation sayfasına gıdelım
    // baslıgın Bootcamp icerdigini test edelım
    driver.get("https://techproeducation.com/");
    String actualTitle= driver.getTitle();
    String expectedTitle="Bootcamp";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
