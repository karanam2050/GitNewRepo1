package com.browserLaunchings;

public class TC_001 extends BaseTest
{
    public static void main(String[] args) 
    {
	
    	launch("firefox");
    	navigateUrl("http://amazon.com");
    }
}
