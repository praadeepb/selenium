package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBEnrolment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Work\\Softwares\\chromedriver.exe");
	String link = "https://api-ute1.airfranceklm.com/travel/cid/authorize?client_id=8bjmn85259hefqetg6jjs7fg&\r\n" + 
			"response_type=code&\r\n" + 
			"scope=login:afkl&\r\n" + 
			"brand=kl&\r\n" + 
			"locale=GB/en&\r\n" + 
			"min_loa=4&\r\n" + 
			"redirect_uri=https://www.ute1.klm.com/";
	WebDriver driver = new ChromeDriver();
	driver.get(link);
	Boolean cookieBarEnabled;
	cookieBarEnabled=driver.findElement(By.className("cookiebar-container")).isDisplayed();
	if (cookieBarEnabled == true)
			{
			driver.findElement(By.id("agreeButton")).click();
			}
	driver.findElement(By.id("mat-input-0")).sendKeys("1070092143");
	driver.findElement(By.id("mat-input-1")).sendKeys("KLMtest123");
	driver.findElement(By.xpath("/html/body/asfc-app/main/bwc-page-template/mat-sidenav-container/mat-sidenav-content/div/section/bw-normal-login/div/section/div[1]/div[1]/button")).click();
	//String redirectURL = driver.getCurrentUrl();
	//System.out.println(redirectURL);
	/*Validations V = new Validations();
	if (V.validateHeader(link, driver))
		System.out.println("Passed");
	else
		System.out.println("Failed");
	driver.close();*/
}
}