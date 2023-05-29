package org.selenium.tests;

import org.selenium.annotations.FrameworkAnnotation;
import org.selenium.base.BaseTest;
import org.selenium.enums.AuthorType;
import org.selenium.enums.CategoryType;
import org.selenium.pages.HomePage;
import org.selenium.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {


	@FrameworkAnnotation(author = { AuthorType.AJAY, AuthorType.GOBINATH }, category = { CategoryType.SMOKE,
			CategoryType.REGRESSION })
	@Test(groups = { "SMOKE", "REGRESSION" })
	public void navigatetostoreRegisterpage() {
		RegisterPage registerPage = new HomePage(getDriver()).load().getMyHeader().navigateToStoreRegisterMenu();
		Assert.assertEquals(registerPage.getTitle(), "Register Account");
	}
		
}
