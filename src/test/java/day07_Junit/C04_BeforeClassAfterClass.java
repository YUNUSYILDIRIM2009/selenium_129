package day07_Junit;

import org.junit.*;

public class C04_BeforeClassAfterClass {
    /*@before class ve after class methodlari sadece static methodlar ıle calısır

     */
@BeforeClass
    public static void beforeClass ()throws Exception{
    System.out.println("class taki tum testlerden omce bir kes calısır");
}
@AfterClass
    public static void afterClass ()throws Exception{
    System.out.println("class taki tum testlerden sonra bir kes calısır");
    }
@After
    public void after ()throws Exception{
        System.out.println("her test methodundan sonra ");
            }
@Before
    public void before ()throws Exception{
        System.out.println("her methodtan once ");
    }
@Test
    public void test01 (){
    System.out.println("ilk test");
}
@Test
    public  void test02 ()throws Exception{
    System.out.println("ıkıncı test");
}
}
