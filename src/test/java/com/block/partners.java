package com.block;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

public class partners {
		public static WebDriver driver;
	 //	public static Actions a1;
		
		@Given("Go to launch {string}")
		public void go_to_launch(String string) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("driver launched");
			driver.manage().window().maximize();
			driver.get("https://www.cumis.com");
		//	a1= new Actions(driver);
		}

		@When("User enter aboutUs")
		public void user_enter_about_us() {
			WebElement a1 = driver.findElement(By.xpath("//button[@id='btnSaveAcknowledgement']"));
			a1.click();
			
			WebElement a = driver.findElement(By.xpath("(//a[@href='/en/cumis/about-us'])[2]"));
			a.click();
		}

		@When("User to read credit unions")
		public void user_to_read_credit_unions() {
			WebElement b = driver.findElement(By.xpath("//a[@class='xds-sidenav-tree-link']"));
			b.click();
		}

		@When("User to read members and clients")
		public void user_to_read_members_and_clients() {
			WebElement c =driver.findElement(By.xpath("(//a[@href='/en/cumis/members-clients'])[2]"));
			c.click();
		}

		@When("User to enter claim form download")
		public void user_to_enter_claim_form_download() {
			WebElement d = driver.findElement(By.xpath("(//a[@href='/en/cumis/claims'])[2]"));
			d.click();
			
			WebElement e = driver.findElement(By.xpath("(//a[@class='xds-sidenav-tree-link'])[4]"));
		e.click();
		WebElement f = driver.findElement(By.xpath("//a[@href='/cumis/-/media/cumis/claims/pdfs---credit-and-mortgage-claims/credit-insurance-claim-submission-procedures.pdf']"));
		f.click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0],scrollIntoView(true)", e);
		}

		@Then("user validate modules browser close")
		public void user_validate_modules_browser_close() {
			driver.quit();
			
		}

	}

