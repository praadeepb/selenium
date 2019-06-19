package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBEnrolment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Work\\Softwares\\chromedriver.exe");
	String link = "https://www.ite1.klm.com/home/nl/en";
	WebDriver driver = new ChromeDriver();
	driver.get(link);
	driver.findElement(By.className("cookiebar-agree-button-agree")).click();
	driver.wait(5000);
	driver.findElement(By.className("js-login-link desktop-only")).click();
	/*Validations V = new Validations();
	if (V.validateHeader(link, driver))
		System.out.println("Passed");
	else
		System.out.println("Failed");
	driver.close();*/
}
}