package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.Arrays;

@RunWith(JUnit4.class)
/**
 * Created by user on 2/13/15.
 */
public class Ukrzal extends TestHelper{

    // Test 1
    @Test
    public void MyTest()throws InterruptedException {

        Ukrzal_classes.setFromStation("Ky");
        String[] sugg1 = Ukrzal_classes.getSuggestionsFrom();
        Assert.assertEquals("Kyaniv Pereval",sugg1[0]);
        Assert.assertEquals("Kyanivka",sugg1[1]);
        Assert.assertEquals("Kybyntsi",sugg1[2]);
        Assert.assertEquals("Kychyranky",sugg1[3]);
        Assert.assertEquals("Kyiv",sugg1[4]);
        Assert.assertEquals("Kyivska Rusanivka",sugg1[5]);
        Assert.assertEquals("Kyj",sugg1[6]);
        Assert.assertEquals("Kykshor",sugg1[7]);
        Assert.assertEquals("Kyn",sugg1[8]);
        Assert.assertEquals("Kynnu",sugg1[9]);

        Ukrzal_classes.setTillStation("Ivano");
        String [] sugg2 = Ukrzal_classes.getSuggestionsTill();


        Assert.assertTrue(Arrays.binarySearch(sugg2, "Ivano-Frankivsk")>=0);
        Assert.assertTrue(Arrays.binarySearch(sugg2, "Ivano-Kopyne")>=0);
        Assert.assertTrue(Arrays.binarySearch(sugg2, "Ivanovka")>=0);
        Assert.assertTrue(Arrays.binarySearch(sugg2, "Ivanovo")>=0);
        Assert.assertTrue(Arrays.binarySearch(sugg2, "Ivanovo S")>=0);
        Assert.assertTrue(Arrays.binarySearch(sugg2, "Ivanovskaia")>=0);
        Assert.assertTrue(Arrays.binarySearch(sugg2, "Ivanovskii")>=0);


        String data = Ukrzal_classes.getDepartDate();
        Assert.assertEquals("02.13.2015", data );
        Ukrzal_classes.setDepartDate();
        String data2 = Ukrzal_classes.getDepartDate();
        Assert.assertEquals("03.08.2015", data2 );
        Ukrzal_classes.setDepartTime();
        Ukrzal_classes.setRoundTrip();
        Ukrzal_classes.pushButton();

        Ukrzal_classes.getPopupHelper();
        String[] messages = Ukrzal_classes.getPopupHelperText();
        Assert.assertEquals("Select a departure point from the drop down list", messages[0]);
        Assert.assertEquals("Select your destination from the drop down list", messages[1]);
        Ukrzal_classes.setPushPopupButton();

        Ukrzal_classes.clearFrom();
        Ukrzal_classes.clearTo();

        Ukrzal_classes.setFromStation("Kiev");
        Ukrzal_classes.setTillStation("Ivano-Frankivsk");
        Ukrzal_classes.pushButton();



        testPassed = true;


    }

}
