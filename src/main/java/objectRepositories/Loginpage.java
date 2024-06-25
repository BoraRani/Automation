package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name="user_name")private WebElement userNameEdt;
	@FindBy(name="user_password")private WebElement passwordEdt;
	@FindBy(xpath="//input[@id='submitButton']")private WebElement loginBtn;
	//Create a constructor to intialize
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	/**
	 * @return the userNameEdt
	 */
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}
	/**
	 * @return the passwordEdt
	 */
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	//Business Libraries - project specific generic utilities
			/**
			 * This method will login to application
			 * @param USERNAME
			 * @param PASSWORD
			 */
		    public void loginToApp(String USERNAME, String PASSWORD)
		    {
		    	userNameEdt.sendKeys(USERNAME);
		    	passwordEdt.sendKeys(PASSWORD);
		    	loginBtn.click();
		    }
		
		

	}
