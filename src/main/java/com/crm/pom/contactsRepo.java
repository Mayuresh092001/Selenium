package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactsRepo {
	public void contactRepo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	//private @FindBy(xpath = "//a[text()='Contacts']");
	//WebElement contact;
	
	
}
