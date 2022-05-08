package launching;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1
{  
	public static WebDriver driver;
	
    public static String projectPath = System.getProperty("user.dir");
    public static Properties P;
    
    
    
	public static void init() throws Exception
	{
		FileInputStream fis = new FileInputStream(projectPath+"\\data.properties");
		
        Properties p = new Properties();
        p.load(fis);
        //P.getProperty("firefoxbrowsers");
	}
        public static void launch(String browser)
        {
		   if(p.getProperty(browser).equals("chrom"))
		   {
			   WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
			 }
		   else if (p.getProperty(browser).equals("firefox"))
		   {
			   WebDriverManager.firefoxdriver().setup();
			   driver = new FirefoxDriver();
			   
		   }
		}
	public static void navigateUrl(String url)
	{
	     driver.get(p.getProperty(url));
	     
	}
}
