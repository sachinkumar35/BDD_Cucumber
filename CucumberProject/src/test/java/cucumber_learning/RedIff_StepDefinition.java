package cucumber_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class RedIff_StepDefinition {

	public WebDriver driver;
	String url = "https://www.rediff.com/";
	SoftAssert softassert = new SoftAssert();
	
	@Given("I open a Chorme Browser")
	public void i_open() {
		System.out.println("I open a Chorme Browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("I enter the url of Rediff in the address bar")
	public void i_enter() {
		System.out.println("I enter the url of Rediff in the address bar");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	@Then("I click on the signin link")
	public void i_click() {
		System.out.println("I click on the signin link");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
	}
	
	
	@And("I enter the RediffMail page")
	public void i_enter_the() {
		System.out.println("I enter the RediffMail page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String actualTitle = "Rediffmail";
		String expectedTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle);
	}
	
	@And("I enter correct username and password")
	public void i_enter_correct() {
		System.out.println("I enter correct username and password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	}
	
	@Then("I click on the SignIn button")
	public void I_click() {
		System.out.println("I click on the SignIn button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click(); 
	}
	
	@And("I check if I am in he Inbox page of RediffMail")
	public void i_check() {
		 System.out.println("I check if I am in he Inbox page of RediffMail");
		}

	
	
	
	
	@Given("I am inside the Inbox page")
	public void i_am() {
		 System.out.println("I am inside the Inbox page");
		}
	
	@And("I validate the persence of the Logout link")
	public void i_validate() {
		 System.out.println("I validate the persence of the Logout link");
		 }
	
	@When("I click on the Logout link")
	public void i_click_on() {
		 System.out.println("I click on the Logout link");
		 
		}
	
	@Then("I am logged out of RediffMail")
	public void i_logged() {
		 System.out.println("I am logged out of RediffMail");
		}
	
	@And("I can validate the presence of RediffHome link")
	public void i_can() {
		 System.out.println("I can validate the presence of RediffHome link");
		 
		}

}
