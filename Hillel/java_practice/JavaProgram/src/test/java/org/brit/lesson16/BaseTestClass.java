package org.brit.lesson16;

import org.testng.annotations.*;

public class BaseTestClass   {
@BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite\n");
    }
@AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite\n");
    }
 @BeforeMethod
    public  void beforeMethodGlobal(){
        System.out.println("Before Method GLOBAL");
    }
@AfterMethod
    public  void aftermethodGlobal(){
        System.out.println("After Method GLOBAL\n");
    }

@BeforeClass
    public void beforeClass (){
    System.out.println("Before Class Global");
    }
@AfterClass
    public void afterClass (){
        System.out.println("After Class Global");
    }


}
