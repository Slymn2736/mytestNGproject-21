package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day09_ActionsClass2 extends TestBase {
    @Test
    public void hoverOver() throws InterruptedException {
//        Create a class: ActionClass2
//        Create test method : hoverOver() and test the following scenario:
//        Given user is on the https://www.amazon.com/
//        When use click on “Account” link
//        Then verify the page title contains “Your Account”
        //        Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        WebElement accountAndList=driver.findElement(By.id("nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountAndList).perform();// move the mouse over accountAndList
        Thread.sleep(1000);
        WebElement accountLink=driver.findElement(By.linkText("Account"));//FAILLING. WE NEED TO MOVE OVER THE ELEMENT
        //        When use click on “Account” link
        accountLink.click();
        //        Then verify the page title contains “Your Account”
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
    }
}