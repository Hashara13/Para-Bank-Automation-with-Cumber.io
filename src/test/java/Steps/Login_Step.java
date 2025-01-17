package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step {
    private WebDriver driver;
 
	@Given("I am in the Para Bank Login Page")
	@Given("I am in the Para Bank Login Page two")

	public void i_am_in_the_para_bank_login_page() {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=36913DD8495585335F822ED68A1B9DB5");
	}

	@When("I enter valid credentials {string} and {string}")
	public void i_enter_valid_credentials(String username, String password) {
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).sendKeys(username);
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).sendKeys(password);
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();
	}

	@Then("Should taken to the Overview Page")
	public void should_taken_to_the_overview_page() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).isDisplayed();
		driver.findElement(By.linkText("Log out")).click();
	}

}
