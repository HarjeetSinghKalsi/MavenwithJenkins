package maven_package1.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage

{
   //login code 
	WebDriver driver;
	
	//step 1
	@FindBy(id="ap_email")
	WebElement username_tf;
	
	@FindBy(id="continue")
	WebElement un_continue;
	
	@FindBy(name="password")
	WebElement password_tf;
	
	@FindBy(id="signInSubmit")
	WebElement pwd_continue;
	
	
	//step 2
    public void un() // entering email
	 {
		username_tf.sendKeys("harjeet.kalsi007@gmail.com");	
	 }
	
	public void un_cont() // clicking continue
	
	 {
		un_continue.click();	
	 }
	
	public void pwd() //entering password
	
	 {
		password_tf.sendKeys("Test@123");	
	 }
	
	public void pwd_sign() // clicking signing
	
	 {
		pwd_continue.click();	
	 }
	
	
	//step 3
	public LoginPage (WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
	 }
	


}
