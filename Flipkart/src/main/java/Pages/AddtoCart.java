package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {
	
	WebDriver driver ;
	WebDriverWait wait1 ;

	
	@FindBy (xpath= "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart ;

	@FindBy (xpath= "//button[@class='_2KpZ6l _3-J4S1']")
	private WebElement additem ;
	
	@FindBy (xpath= "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeorder ;
	
	
	
	public AddtoCart (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		 wait1 = new WebDriverWait (driver, 20);
		
	}
	

	public void ClickonAddtoCart ()
	{
	
		addtocart.click();
	}
	
	public void ClickonAdditem ()
	{
		wait1.until(ExpectedConditions.visibilityOf(additem));
		additem.click();
	}
	
	public void ClickonPlacerder ()
	{
		placeorder.click();
	}
}
