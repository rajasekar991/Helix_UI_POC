package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.helix.team.utils.ElementUtils;

public class HelixProjectAdminPage {
	
private WebDriver driver;
private boolean isProjAdminIsvisible = false;
private By lable_proj_admin = By.xpath("//strong[text()= 'Project Administration']");
ElementUtils utils = new ElementUtils();
	
	public HelixProjectAdminPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean validateProjAdminLable()
	{
		if(driver.findElement(lable_proj_admin).getText().equals("Project Administration"))
		{
			isProjAdminIsvisible = true;
		}
		return isProjAdminIsvisible;
	}
	
	public void selectValueFromProjSeries(WebDriver driver,String name, String value)
	{
		utils.selectValueFromDropDown(this.driver, name, value);
	}
	
	public void selectValueFromEventType(WebDriver driver,String name, String value)
	{
		utils.selectValueFromDropDown(this.driver, name, value);
	}

}
