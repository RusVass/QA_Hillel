package org.brit.lesson16;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTests extends BaseTestClass{

@BeforeClass
    public void beforeClass(){
    System.out.println("BeforeClass first\n");
    }
@AfterClass
    public void afterClass(){
    System.out.println("AfterClass first\n");
    }

    // якщо потрібно виконати тест перед кожним
    // таким тестовим  методом

@BeforeMethod
    public void  beforeMethod(){
    System.out.println("Before each test first");
}
    // якщо потрібно виконати тест після кожного
    // такого тестового  метода
@AfterMethod
    public void aftermethod (){
    System.out.println("After each method first");
}
@Test (description = "done")
    public void  test1(){
    System.out.println("    We are in test1 first");
    }
 @Test (alwaysRun = true)
    public void  test2(){
        System.out.println("     We are in test2 first");
    }
@Test (invocationCount = 3)
    public void  test3(){
        System.out.println("    We are in test3 first");
    }
@Test
    public void  test4(){
        System.out.println("    We are in test4 first");
    }
    @Test
    public void  test5(){
        System.out.println("    We are in test5 first");
    }

    public static class SecondTests extends BaseTestClass {

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass second\n");
        }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass second\n");
        }

        // якщо потрібно виконати тест перед кожним
        // таким тестовим  методом

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("Before each test second");
    }
        // якщо потрібно виконати тест після кожного
        // такого тестового  метода
    @AfterMethod
    public void aftermethod (){

        System.out.println("After each method second");
    }
    @Test (priority = 100, enabled = false)
     public void  test1(){
        System.out.println("    We are in test1 second");
        }
        @Test (priority = 95) //dependsOnMethods = "test4")
        public void  test2(){
            System.out.println("    We are in test2 second");
        }
        @Test (priority = 90)
        public void  test3(){

        System.out.println("    We are in test3 second");
        }
        @Test (priority = 80)
        public void  test4(){
            Assert.assertTrue(true);
            System.out.println("    We are in test4 second");
        }
        @Test (priority = 70)
        public void  test5(){
            System.out.println("    We are in test5 second");
        }

    }
}
