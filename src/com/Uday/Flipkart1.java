package com.Uday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\udayf\\Downloads\\chromedriver-win64");
WebDriver dr=new ChromeDriver();
dr.get("https://www.flipkart.com/");
	}

}
