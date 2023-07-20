package StepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefs.Hooks;

public class BasicStepdef {
	WebDriver driver = Hooks.driver;

	@Given("I have launched the  Amazon application.")
	public void i_have_launched_the_Amazon_application()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    driver.get("https://www.amazon.com");
		Thread.sleep(5000);
	}

	@When("I entered product name as {string}")
	public void i_entered_product_name_as(String string) throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    WebElement SearchBox = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
		SearchBox.sendKeys("Samsung mobile");
		Thread.sleep(5000);

	}

	@When("I click on search button")
	public void i_click_on_search_button()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchButton.click();
		Thread.sleep(5000);

	}

	@Then("I can able to see all the product")
	public void i_can_able_to_see_all_the_product() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		List<WebElement> Prodname = driver.findElements(By.xpath("//div[@class = 'a-section']//h2//span"));
		Thread.sleep(5000);
	}

	@When("I click on the Product name as {string}")
	public void i_click_on_the_Product_name_as(String string)throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.amazon.in/Samsung-Storage-Battery-Octa-Core-Processor/dp/B0BZCR6TNK/ref=sr_1_1_sspa?keywords=samsung%2Bmobile&qid=1689840670&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT");
		Thread.sleep(5000);

	}

	@When("I click on the Add to cart link")
	public void i_click_on_the_Add_to_cart_link()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	    WebElement Addtocart = driver.findElement(By.xpath("//input[@id ='add-to-cart-button']"));
	    Addtocart.click();
		Thread.sleep(5000);
	}	    


	@Then("I can see that product in the cart.")
	public void i_can_see_that_product_in_the_cart() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		List<WebElement> Prodname = driver.findElements(By.xpath("//div[@class = 'a-section']//h2//span"));
		Thread.sleep(5000);


	}

}



