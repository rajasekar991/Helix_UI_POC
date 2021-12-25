package com.helix.team.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	
	/*
	 * Auhtor: Rajesh Matadh
	 * Purpose: THis method is used to select value from any dropdown
	 */
	public void selectValueFromDropDown(WebDriver driver, String nameOftheSelectClass, String valueToSelect)
	{
		Select drpCountry = new Select(driver.findElement(By.name(nameOftheSelectClass)));
		drpCountry.selectByVisibleText(valueToSelect);
		System.out.println(valueToSelect + " This value is selected from the dropdown");
	}
}
