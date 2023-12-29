package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameTbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDescriptionTbx;
	
	@FindBy(id="ext-gen23")
	private WebElement selectCustDD;
	
	@FindBy(linkText = "Our Company")
	private WebElement ourCompanyLink;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//span[text()='Tasks of']/../../div[2]")
	private  WebElement actualCustomerLocation;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}
	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}
	public WebElement getCustomerDescriptionTbx() {
		return customerDescriptionTbx;
	}
	public WebElement getSelectCustDD() {
		return selectCustDD;
	}
	public WebElement getOurCompanyLink() {
		return ourCompanyLink;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerLocation() {
		return actualCustomerLocation;
	}
	
}
