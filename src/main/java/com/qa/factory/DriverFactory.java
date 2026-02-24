package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
   public WebDriver driver;
   public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public void init_Driver(String browser) {

        System.out.println("browser value is: "+ browser);

        if(browser.equals("Chrome"))
       /* this.driver = driver;
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");*/
    }
}
