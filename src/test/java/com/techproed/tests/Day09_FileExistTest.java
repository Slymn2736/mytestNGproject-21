package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExistTest {
    @Test
    public void isExist(){
//      We cannot automate desktop applications with selenium
//      But we can use JAVA to understand a file path exist in our computers


        String homePath = System.getProperty("user.home");
        System.out.println(homePath);
     //   String pathOfFile = "C:\\Users\\gulsl\\Desktop";
        String pathOfFile = homePath+ "Desktop";

      boolean isExist=Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isExist);

    }
}
