package stepDefination;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinations.BaseClass;

public class FirstExample extends BaseClass {
    @BeforeAll
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    @Given("the user is on the TS homepage")
    public void openBrowser() {
        driver.get("https://v1.training-support.net/");
        Assertions.assertEquals ("Training Support",driver.getTitle());
    }

    @When("they click on the About Us link")
    public void clickLink() {

        driver.findElement(By.id("about-link")).click();
    }
    @Then("the user is redirected to the about page")
    public void aboutPage(){
        Assertions.assertEquals ("About Training Support",driver.getTitle());
    }
    @Then("close the browser")
    public void closeBrowser(){

        driver.quit();
    }
}