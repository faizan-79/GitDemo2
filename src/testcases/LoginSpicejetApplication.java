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
		sj.Username().sendKeys("helllloOOOOOoooo");
		sj.Password().sendKeys("hello12364");
		// sj.Login().click();
		sj.Signup().click();
		
		SpicejetSignup rs = new SpicejetSignup(driver);
		rs.FirstName().sendKeys("KATRINAAAAAAAAAAAAAAAAAAAAAAAA KAIIIIIFFFFFFFFFFFFFFFF");
		rs.LastName().sendKeys("SHHHHAAAAAAAAAAAAARUKH KHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANNNNNNAAAA");
		rs.Submit().click();
	}

}
