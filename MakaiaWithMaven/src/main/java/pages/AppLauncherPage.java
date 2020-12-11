package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class AppLauncherPage extends PreAndPost{
	
	public AppLauncherPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public ServicePage clickService() {
		click(locateElement("link","Service"));
		return new ServicePage(driver,test);
	}
	

	public AppLauncherPage scrollDown(){
		scrollDown("//p[text()='Refunds']");
		return this;
	}
	

	
}
