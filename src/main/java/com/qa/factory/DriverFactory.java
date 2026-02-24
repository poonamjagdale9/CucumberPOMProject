package com.qa.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
   public WebDriver driver;
   public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public void init_Driver(String browser) {

        System.out.println("browser value is: "+ browser);

        if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        }
        else{
            System.out.println("please pass the correct browser value;"+ browser);
        }
       /* this.driver = driver;
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");*/
    }
    
}
