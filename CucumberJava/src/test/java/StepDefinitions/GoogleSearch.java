package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "D:/eclipse_plugin/CucumberJava/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    }

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	   
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
	    
	}

	@And("user clicks on enter button")
	public void user_clicks_on_enter_button() {
	    
	}

	@Then("user is navigated search results")
	public void user_is_navigated_search_results() {
	   
	}
}
