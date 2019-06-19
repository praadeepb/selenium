package selenium;

import org.openqa.selenium.WebDriver;

public class Validations {
	public boolean validateHeader(String verifyLink, WebDriver driver) {
		if (verifyLink.contains(driver.getCurrentUrl()))
		{
		System.out.println("URL validation success");
		return true;
		}
	return false;	
	}
}