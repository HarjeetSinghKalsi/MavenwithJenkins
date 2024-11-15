package maven_package1.Maven_Project1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	WebDriver driver;
	
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']") //hoverover signing
	WebElement accountandlist;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]") //clicking on sign in
	WebElement signin_to_login;
	
	@FindBy(id="twotabsearchtextbox") //search shoe
	WebElement search_tf;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']") //hoverover signout
	WebElement signout_hoverover;
	
	@FindBy(xpath="//span[.='Sign Out']") //clicking on signout
	WebElement logout;
	
	
	//step 2
	public void aandlist(WebDriver driver)
	 {
		Actions a1 = new Actions (driver); //hoverover
		a1.moveToElement(accountandlist).perform();
	 }
	
	public void signin()
	 {
		signin_to_login.click();	
	 }
	
	public void searching()
	 {
		search_tf.sendKeys("shoe" + Keys.ENTER);
		
	 }
	
	public void logout_amazon()
	
	 {
		logout.click();	
	 }
	
	
	
	//step 3
	public HomePage (WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
	 }
	

}
