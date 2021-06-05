package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonDropDown {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//      1. Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void dropDownTest() {
//     2. Find the element of the dropdown element. HINT: By.id("searchDropdownBox")
        driver.findElement(By.id("searchDropdownBox")).click();
//     3. Print the first selected option and assert if it "All Departments"
        WebElement firstElement = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(firstElement);
        String selectedFirstOption = select.getFirstSelectedOption().getText();
        System.out.println(selectedFirstOption);
        Assert.assertEquals(selectedFirstOption,"All Departments");
    }
    @Test
    public void forthElement(){
 //     4. Select the 4th option by index (index of 3) and assert the name is "Amazon Devices"
//          .(after you selected you need to use get first selected option method)
        WebElement forthElement = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(forthElement);
        select.selectByIndex(3);

        String selectForthOption = select.getFirstSelectedOption().getText();
        System.out.println(selectForthOption);
        Assert.assertEquals(selectForthOption,"Amazon Devices");
    }
    @Test
    public void allDropdownOptions() {
//     5. Print all of the dropdown options-getOptions();
//          method returns the List<WebElement>.Using loop, print all options/
        WebElement allDropdownOptions = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(allDropdownOptions);
        List<WebElement> allAmazonOptions = select.getOptions();
        for (WebElement each : allAmazonOptions) {
            System.out.println(each.getText());
        }
    }
    @Test
    public void totalNumber(){
//      6. Print the total number of options in the dropdown
        WebElement totalNumber = driver.findElement(By.id("searchDropdownBox"));
        Select select1 = new Select(totalNumber);
        int numberOfTotalOptions = select1.getOptions().size();
        System.out.println(numberOfTotalOptions);
     }
     @Test
     public void checkAppliances() {
//     7. Check if'Appliances' is a drop down option.
//          Print true if "Appliances" is an option. Print false otherwise.


     }

//     8. BONUS: Check if the dropdown is in Alphabetical Order.


    }








