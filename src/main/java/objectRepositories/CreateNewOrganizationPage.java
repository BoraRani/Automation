package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	// Declaration
				@FindBy(name = "accountname")
				private WebElement OrgNameEdt;

				

				@FindBy(xpath = "//input[@title='Save [Alt+S]']")
				private WebElement SaveBtn;

				// initializations
				public CreateNewOrganizationPage(WebDriver driver) {
					PageFactory.initElements(driver, this);
					
				}

				/**
				 * @return the orgNameEdt
				 */
				public WebElement getOrgNameEdt() {
					return OrgNameEdt;
				}

				/**
				 * @return the saveBtn
				 */
				public WebElement getSaveBtn() {
					return SaveBtn;
				}


//Business LIbrary
/**
 * This method will create a new organization
 * @param ORGNAME
 */
public void createNewOrganization(String ORGNAME)
{
	OrgNameEdt.sendKeys(ORGNAME);
	SaveBtn.click();
}


}
