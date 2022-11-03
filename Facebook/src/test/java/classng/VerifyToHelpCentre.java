package classng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.MessengerPage;
import Pages.RoomsPage;

public class VerifyToHelpCentre {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Automation D\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		LoginPage loginpage = new LoginPage (driver);
		loginpage.clickonmessengertab();

		MessengerPage messengerpage = new MessengerPage (driver);
		messengerpage.RoomsTab();
		
		RoomsPage roomspage = new RoomsPage (driver);
		roomspage.VisitourhelpCentreTab();
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
