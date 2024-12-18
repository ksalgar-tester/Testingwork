package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver d;

	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
	System.out.println("browser is open");	
	d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.get("https://google.com");
	Thread.sleep(2000);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on google search page");
	}

	@When("user enters & text in search box")
	public void user_enters_text_in_search_box() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user enters & text in search box");
	}

	@And("hits enter")
	public void hits_enter() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("hits enter");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to search results");
	}



}
