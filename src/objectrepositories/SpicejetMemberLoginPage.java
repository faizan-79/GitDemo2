package objectrepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpicejetMemberLoginPage {

	WebDriver driver;

	public SpicejetMemberLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")
	WebElement Username;

	@FindBy(id = "ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")
	WebElement Password;

	@FindBy(id = "ControlGroupLoginView_MemberLoginView2LoginView_ButtonLogIn")
	WebElement Login;

	@FindBy(xpath = "//span[@class='float-right signup-link-wrapper']/a")
	WebElement Signup;

	public WebElement Username() {
		return Username;
	}

	public WebElement Password() {
		return Password;
	}

	public WebElement Signup() {
		return Signup;
	}

}
