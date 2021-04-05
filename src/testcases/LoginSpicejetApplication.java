package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositories.SpicejetMemberLoginPage;
import objectrepositories.SpicejetSignup;

public class LoginSpicejetApplication {

	@Test
	public void SpicejetLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Selchromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://book.spicejet.com/Login.aspx");
		SpicejetMemberLoginPage sj = new SpicejetMemberLoginPage(driver);
		sj.Username().sendKeys("helllloOOOOOooooo");
		sj.Password().sendKeys("hello1235464644444444444444444648688464464664");
		// sj.Login().click();
		sj.Signup().click();
		
		SpicejetSignup rs = new SpicejetSignup(driver);
		rs.FirstName().sendKeys("KAREEEEEEEEEEEEENAAA KAPIOOOORRRRRRR");
		rs.LastName().sendKeys("KHHHAAAAAAAAAAAAAAANNNNN");
		rs.Submit().click();
	}

}
