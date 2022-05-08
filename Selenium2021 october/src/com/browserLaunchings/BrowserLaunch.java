package com.browserLaunchings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
        new FirefoxDriver();
	}

}
