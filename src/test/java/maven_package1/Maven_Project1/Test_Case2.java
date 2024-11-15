package maven_package1.Maven_Project1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case2 extends Launch_Quit
{
	@Test
	public void login_to_amazon()
	{
		//searching shoes in search result and logout
				
		HomePage h1 = new HomePage(driver); //creating object of HomePage constructor 
		h1.aandlist(driver);  //calling HomePage class methods
		h1.signin();
		LoginPage l1 = new LoginPage(driver);  //creating object of LoginPage constructor
		l1.un();             // calling LoginPage class methods
		l1.un_cont();
		l1.pwd();
		l1.pwd_sign();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"); //used assertion to get expected result
		h1.searching(); // search shoe in home page
		h1.aandlist(driver);
		h1.logout_amazon();
		
		
	}


}
