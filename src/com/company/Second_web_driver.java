package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * List all links
 */
public class Second_web_driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        WebDriver a = new ChromeDriver();

        a.get("https://google.com");

        WebElement i = a.findElement(By.id("gbqfq"));
        i.sendKeys("qa factory");
        WebElement n = a.findElement(By.name("btnG"));
        n.click();
        Thread.sleep(1000);
        WebElement s = a.findElement(By.id("ires"));
        List<WebElement> l = s.findElements(By.tagName("a"));
        int k;
        for(k = 0; k < l.size(); k++){
            WebElement f = l.get(k);
            System.out.println(f.getAttribute("href"));
        }
    }
}
