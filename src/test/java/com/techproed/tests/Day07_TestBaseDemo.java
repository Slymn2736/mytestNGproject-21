package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day07_TestBaseDemo extends TestBase {

    @Test
    public void test1(){

        //        Create a class:TestBaseDemo
//        Create two methods: test1, test2
//        test1 search “porcelain teapot” on google

    driver.get("https://www.google.com");
    driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);

//        Then verify page contains “porcelain teapot”
        Assert.assertTrue(driver.getPageSource().contains("porcelain teapot"));

    }

    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
//        test2 search “porcelain teapot” on amazon
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("porcelain teapot" + Keys.ENTER);
//        Then verify page contains “porcelain teapot”
        Assert.assertTrue(driver.getPageSource().contains("porcelain teapot"));

    }


}
