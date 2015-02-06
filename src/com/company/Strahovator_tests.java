package com.company;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
/**
 * Created by user on 2/6/15.
 */
@RunWith(JUnit4.class)
public class Strahovator_tests {

    @Before
    public void Init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        TestHelper.driver = new ChromeDriver();
        Strahovator_classes.open();


    }

    @After
    public void CleanUp(){

        //    if(!testPassed){
        //      File scrFile = ((TakesScreenshot) a).getScreenshotAs(OutputType.FILE);
        //      FileUtils
        //     }
        TestHelper.driver.close();
    }

    // Test 1
    @Test
    public void MyTest()throws InterruptedException {

        Strahovator_classes.setAutoType(0);
        Strahovator_classes.setdetailsType(0);
        Strahovator_classes.setdgo(0);
        Strahovator_classes.setnoCrash(0);
        Strahovator_classes.setperiod(0);
        Strahovator_classes.setzoneName(0);

        String company = Strahovator_classes.getLogoName();




    }
}
