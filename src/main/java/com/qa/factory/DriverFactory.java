package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver initDriver(String browser) {
		System.out.println("Browser value is: " + browser);
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} 
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} 
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		} 
		else if (browser.equals("safari")) {
			// no binary for Safari hence no need to manage it using manager
			tlDriver.set(new SafariDriver());
		}
		else {
			System.out.println(browser+ " valus is invalid valuse, Please pass valid browser value");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}
