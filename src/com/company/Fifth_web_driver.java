package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 1/26/15.
 */
public class Fifth_web_driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        WebDriver a = new ChromeDriver();

        a.get("http://demoqa.com/registration/");

        WebElement name = a.findElement(By.xpath("//input[@name='first_name']"));

        name.sendKeys("Max");

        WebElement lastname = a.findElement(By.xpath("//input[@name='last_name']"));

        lastname.sendKeys("Power");

        WebElement mar_status = a.findElement(By.xpath("//div[@class='radio_wrap']/label[text()='Divorced']/following-sibling::input"));
        mar_status.click();

        WebElement hobby = a.findElement(By.xpath("//div[@class='radio_wrap']/label[text()='Dance']/following-sibling::input"));
        hobby.click();

        WebElement country = a.findElement(By.xpath("//select[@id=\"dropdown_7\"]/option[@value='Peru']"));
        country.click();

    }
}
