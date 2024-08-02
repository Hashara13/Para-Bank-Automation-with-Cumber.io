package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    private WebDriver driver;
 
	@Given("I am in the Para Bank Login Page")
	public void i_am_in_the_para_bank_login_page() {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=36913DD8495585335F822ED68A1B9DB5");
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
    driver.findElement(By.name("username")).sendKeys("user");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.name("password")).submit();
	}

	@Then("Should taken to the Overview Page")
	public void should_taken_to_the_overview_page() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).isDisplayed();
		driver.findElement(By.linkText("Log out")).click();
	}

}
