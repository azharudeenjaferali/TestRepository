package com.aiite.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass {
	
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
	}

}
