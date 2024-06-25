package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organaizationpage {
	//Declaration
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement CreateOrgLookUpImg;
    //Initialization
	
	public Organaizationpage(WebDriver driver) // test script
	{
		PageFactory.initElements(driver, this);
	}
	
    //Utilization
	public WebElement getOrgLookUpImg() {
		return CreateOrgLookUpImg;
	}

	//Business Library
	/**
	 * This method will get the organization header text
	 * @return
	 */
	public void clickOnCreateOrgLookUpImg()
	{
		CreateOrgLookUpImg.click();
	}
}


