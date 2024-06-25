package VtigerTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericUtilities.ExcelfileUtilities;
import GenericUtilities.JavaUtility;
import GenericUtilities.PropertyfileUtility;
import GenericUtilities.WebdriverUtilities;
import objectRepositories.CreateNewOrganizationPage;
import objectRepositories.HomePageextendsWebdriverUtility;
import objectRepositories.Loginpage;
import objectRepositories.Organaizationpage;
import objectRepositories.OrganizationInfoPage;

public class CreateOrgTest {
public static void main(String[] args) throws Throwable {
	WebDriver driver=null;
	PropertyfileUtility putil=new PropertyfileUtility();
	ExcelfileUtilities eutil=new ExcelfileUtilities();
	WebdriverUtilities wutil=new WebdriverUtilities();
	JavaUtility jutil=new JavaUtility();
	//fetch browser name
	String BROWSER=putil.readDataFromPf("browser");
	System.out.println("BROWSER");
	//Launch browser
	if(BROWSER.equals("edge")) {
		driver=new EdgeDriver();
	}
	else
		if(BROWSER.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else
			if(BROWSER.equals("firefox")) {
				driver=new FirefoxDriver();
			}
			else {
				System.out.print("INVALID BROWSER NAME");
			}
	wutil.maximizeWindow(driver);
	wutil.waitForPageLoad(driver);
	//fetch URL
	String UN=	putil.readDataFromPf("un");
	driver.get(UN);
	String PWD=putil.readDataFromPf("pwd");
	driver.get(PWD);
	//Create object of Login apge POM class
		Loginpage lp=new Loginpage(driver);
		lp.loginToApp(UN, PWD);
		//Create Object of Homepage
		HomePageextendsWebdriverUtility h=new HomePageextendsWebdriverUtility(driver);
		h.clickOnOrganizationLink();
		//click on orgLookup img
		Organaizationpage op=new Organaizationpage(driver);
			op.clickOnCreateOrgLookUpImg();	
			//give org name
			String orgname = eutil.readDatafromExcl("Sheet1", 0, 0);
			CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
			cnop.createNewOrganization(orgname+jutil.getRandomNum());	
			//click on save btn
			cnop.getSaveBtn();
			//create object of OrganizationInfpage
			OrganizationInfoPage oip=new OrganizationInfoPage(driver);
			String header = oip.getHeader();
			if(header.contains(orgname)) {
				System.out.println("Org is created and TC is pass");
			}
			else{
				System.out.println("TC is failed");
			}
			//logout from app
			h.logOutOfApp(driver);
			
}
}
