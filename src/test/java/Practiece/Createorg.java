package Practiece;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Createorg {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
				driver.get("http://localhost:8888/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='submitButton']")).click();
				
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[text()='Organizations']")).click();
				driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Myntra");
				driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
				String actText = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(actText.contains("Myntra"))
				{
					System.out.println(" org created TC is Pass");
				}
				else {
					System.out.println("org is not created TC is Fail");
				}
				WebElement admele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				Actions a=new Actions(driver);
				a.moveToElement(admele).perform();
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
