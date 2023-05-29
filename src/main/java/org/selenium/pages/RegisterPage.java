package org.selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import components.ProductThumbnail;


public class RegisterPage extends BasePage{
	
	private ProductThumbnail productThumbnail;

	public RegisterPage(WebDriver driver) {
		super(driver);
		productThumbnail = new ProductThumbnail(driver);
	}
	@Step
	public ProductThumbnail getProductThumbnail() {
		return productThumbnail;
	}
	
	private final By title = By.xpath("//*[@id=\"content\"]/h1");

	public String getTitle() {
		// return driver.findElement(title).getText();
		return wait.until(ExpectedConditions.visibilityOfElementLocated(title)).getText();
		// return this;
	}
}
