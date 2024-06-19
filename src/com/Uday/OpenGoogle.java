package com.Uday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udayf\\Downloads\\chromedriver-win64.zip");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

}
