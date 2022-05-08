package com.browserLaunchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test
{

	public static void main(String[] args)
	{
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver","D:\\selenium2021_wd\\Selenium2021 october\\Resources\\chromedriver_win32\\chromedriver.exe ");
       WebDriverManager.chromedriver().setup();
		
        driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.facebook.com");
		driver.get("http://www.amazon.com");
	     System.out.println(driver.getTitle());
	     WebDriverManager.firefoxdriver().setup();
	     driver = new FirefoxDriver();
		
		driver.quit();
		driver.quit();
	}

}
