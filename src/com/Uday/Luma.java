package com.Uday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luma {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://magento.softwaretestingboard.com/");
		driver.get("https://www.dominos.co.in/");
		driver.manage().window().maximize();
	PageFactory.initElements(driver, Onlineorder.class);
		Onlineorder.Onlineorderpage.click();
		Thread.sleep(10000);
	PageFactory.initElements(driver, Location.class);
	    Location.alertmessage.click();
	    Location.location.click();
	    Thread.sleep(5000);
	    Location.address1.sendKeys("cuddalore");
	    Thread.sleep(5000);
	    Location.address2.click();
	    Thread.sleep(5000);
	    Location.address3.sendKeys("register office");
	    Thread.sleep(5000);
	    Location.address4.click();
	    Thread.sleep(5000);
	PageFactory.initElements(driver, addideam.class);
//	    addideam.vegpizza.click();
	    Thread.sleep(5000);
	    addideam.margherita1.click();
	    addideam.addpizza1.click();
//	    addideam.margherita2.click();
	    addideam.addpizza2.click();
	    addideam.peppypaneer1.click();
	    addideam.addpizza3.click();
//	    addideam.peppypaneer2.click();
	    addideam.addpizza4.click();
	    addideam.farmhouse1.click();
	    addideam.addpizza5.click();
//	    addideam.farmhouse2.click();
	    addideam.addpizza6.click();
	    addideam.checkout.click();
	    Thread.sleep(5000);
	PageFactory.initElements(driver, Placeorder.class);
	    Placeorder.pizzaremove.click();
	    Thread.sleep(5000);
	    Placeorder.addpesi.click();
	    Thread.sleep(5000);
	   // Placeorder.incresspesi.click();
	   // Placeorder.pesiremove.click();
	    int addpesi=12;
	    for(int i=0;i<addpesi;i++) {Placeorder.incresspesi.click();}
	    int decresepesi=7;
	    for(int i=1;i<decresepesi;i++) {Placeorder.pesiremove.click();}
	    Placeorder.placeorder.click();
	 PageFactory.initElements(driver, Addaddress.class);
	    Addaddress.firstname.sendKeys("Seenuvasan");
	    Addaddress.lastname.sendKeys("Ganesan");
	    Addaddress.mobilenubmer.sendKeys("8098587455");
	    Addaddress.email.sendKeys("seenuvasang00@gmail.com");
	    Addaddress.address.sendKeys("cuddalore");
	    Addaddress.housenumber.sendKeys("37");
	    Addaddress.submit.click();
	}

}
