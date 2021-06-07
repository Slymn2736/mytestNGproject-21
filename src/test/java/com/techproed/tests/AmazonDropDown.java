package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class AmazonDropDown extends TestBase {

    @Test
    public void dropDownTest() throws InterruptedException {
        //Go to https://www.amazon.com
        driver.get("https://www.amazon.com/");

//     Find the element of the dropdown element. HINT: By.id("searchDropdownBox")
        WebElement amazonDropDown = driver.findElement(By.id("searchDropdownBox"));
//      Print the first selected option and assert if it "All Departments"
        Select select = new Select(amazonDropDown);
        String selectedFirstOption = select.getFirstSelectedOption().getText();
        System.out.println(selectedFirstOption);
        Assert.assertEquals(selectedFirstOption, "All Departments");

        //    Select the 4th option by index (index of 3) and assert the name is "Amazon Devices"
//          .(after you selected you need to use get first selected option method)
        select.selectByIndex(3);
        Thread.sleep(3000);
        Assert.assertEquals(select.getFirstSelectedOption(), "Amazon Devices");

//     Print all of the dropdown options-getOptions();
//          method returns the List<WebElement>.Using loop, print all options/
        List<WebElement> allAmazonOptions = select.getOptions();
        List<String> optionString = new ArrayList<>();
        boolean flag = false;
        for (WebElement each : allAmazonOptions) {
            optionString.add(each.getText());
            System.out.println(each.getText());
            if (each.getText().equals("Appliances")) {
                flag = true;
            }
        }

//   Check if "Appliances" is a dropdown option. Print "true" if it is, print "false" if it is not.
        System.out.println("Appliances: " + flag);

//   Check if the dropdown is in alphabetical order
        List<String> firstList = new ArrayList();
        for (WebElement e : select.getOptions()) {
            firstList.add(e.getText());
        }
    }
}








