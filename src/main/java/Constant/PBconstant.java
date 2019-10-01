package Constant;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PBconstant {
	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fi;
	@BeforeMethod
	public void launch()throws Throwable
	{
	//System.setProperty("webdriver.chrome.driver", "‪M:\\AllSeleniumFiles\\chromedriver_win32\\chromedriver.exe");	
	 //System.setProperty("webdriver.chrome.driver", "‪M:\\SELENIUM_ALLFILES\\chromedriver_win32 (1)\\chromedriver.exe");
		p=new Properties();
	 fi=new FileInputStream("M:\\SELENIUMWORK_PLACE_MAVEN\\PROJECT\\PropertyFile\\Environment.properties");
	p.load(fi);
	driver=new ChromeDriver();
	driver.get(p.getProperty("objurl"));
	driver.manage().window().maximize();
	}
	@AfterMethod
	public void logout()
	{
	driver.close();
	}
	}

