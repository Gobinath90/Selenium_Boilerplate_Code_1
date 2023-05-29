/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium Java Test Framework & Best Practices - Masterclass (https://www.udemy.com/course/selenium-java-test-framework/)
 * Tutor: Omprakash Chavan (https://www.udemy.com/user/omprakash-chavan/)
 */

/***************************************************/

package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.enums.WaitStrategy;
import org.selenium.pages.BasePage;
import org.selenium.pages.RegisterPage;

public class MyHeader extends BasePage {

	private final By Myaccount = By.xpath("//a[@title='My Account']");
	
	private final By Register = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	
	public MyHeader(WebDriver driver) {
		super(driver);
	}

	public RegisterPage navigateToStoreRegisterMenu() {
		// driver.findElement(storeMenuLink).click();
		//wait.until(ExpectedConditions.elementToBeClickable(storeMenuLink)).click();
		click(Myaccount, WaitStrategy.CLICKABLE, "MyAccount Menu Link");
		click(Register, WaitStrategy.CLICKABLE, "Register Menu Link");
		return new RegisterPage(driver);
	}
}
