package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

/**
 * Created by user on 2/6/15.
 */
public class Strahovator_classes {
    private static String autoType = "//select[contains(@id,\"ts_type\")]";
    private static String detailsType = "//select[contains(@id,\"ts_details_type\")]";
    private static String zoneName= "//select[contains(@id,\"ts_zone\")]";
    private static String noCrash = "//select[contains(@id,\"no_crash_years_qty\")]";
    private static String period = "//select[contains(@id,\"period\")]";
    private static String dgo = "//select[contains(@id,\"dgo\")]";

    public static void open() {
        TestHelper.driver.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");
    }

    public static void setAutoType(Integer i){
        WebElement f = getData.getValueElement(autoType);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setdetailsType(Integer i){
        WebElement f = getData.getValueElement(detailsType);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setzoneName(Integer i){
        WebElement f = getData.getValueElement(zoneName);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setnoCrash(Integer i){
        WebElement f = getData.getValueElement(noCrash);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setperiod(Integer i){
        WebElement f = getData.getValueElement(period);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setdgo(Integer i){
        WebElement f = getData.getValueElement(dgo);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static String getLogoName(){
        WebElement n = getData.getValueElement("//tbody//img");
        String[] k = n.getAttribute("src").split("/");

        return k[-1];
    }

    private static Map<String,String> companies = new HashMap<String, String>(){
        {
         put();

        }
    }
