package com.dollibar.generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takesc {
	public static void getScreenshot(WebDriver driver, String name) {
		SimpleDateFormat date1=new SimpleDateFormat("yyyy-MM-dd");
		String d= date1.format(new Date());
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			try {
				Files.copy(src,new File("./"+d+System.currentTimeMillis()+" "+name+".png"));
			} catch (IOException e) {
			
			}}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/bonigarcia/webdrivermanager");
		getScreenshot(driver, "img1");
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
