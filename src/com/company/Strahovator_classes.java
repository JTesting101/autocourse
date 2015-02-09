package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

/**
 * Created by user on 2/6/15.
 */
public class Strahovator_classes {
    private static String autoType = "//select[contains(@id,\"ts_type\")]";
    private static String detailsType = "//select[contains(@id,\"ts_details_type\")]";
    private static String zoneName = "//select[contains(@id,\"ts_zone\")]";
    private static String noCrash = "//select[contains(@id,\"no_crash_years_qty\")]";
    private static String period = "//select[contains(@id,\"period\")]";
    private static String dgo = "//select[contains(@id,\"dgo\")]";
    private static String tooltip = "//div[@class=\"tooltip fade top\"]//div[@class=\"tooltip-inner\"]/p[text()= 'Это та часть страховой выплаты, которую в любом случае необходимо будет оплатить Вам самостоятельно, если произойдет ДТП по Вашей вине']";
    private static String franchise = "//a[text()=\"Франшиза\"]";
    private static String submitButton1 = "//table[@class=\"osago_result\"]/tbody/tr/td/button";
    private static String no_reg = "//strong[text()='без регистрации']";

    public static void open() {
        TestHelper.driver.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");
    }

    public static void setAutoType(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(autoType);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setdetailsType(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(detailsType);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setzoneName(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(zoneName);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setnoCrash(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(noCrash);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setperiod(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(period);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setdgo(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(dgo);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static String getLogoName() {
        WebElement n = TestHelper.getData.getValueElement("//tbody//img");
        String[] k = n.getAttribute("src").split("/");
        // We get the last element i.e. <company_short_name>.gif
        String comp = companies.get(k[k.length-1]);

        return comp;
    }

    public static void getTooltip(){
        Actions hover = new Actions(TestHelper.driver).moveToElement(TestHelper.getData.getValueElement(franchise));
        hover.perform();
        WebElement f = TestHelper.getData.getValueElement(tooltip);
    }

    public static void pushBuy1(){
        TestHelper.pushButton(submitButton1);
    }

    public static void noReg(){
        TestHelper.pushButton(no_reg);
    }

    private static Map<String, String> companies = new HashMap<String, String>() {
        {
            put("ut.gif","Utico");
            put("sk.gif","Скайд");
        }
    };


}
