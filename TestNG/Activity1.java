package Activies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Activity1
{

    WebDriver driver;

    @BeforeClass
    public void beforeMethod()
    {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net");
    }

    @Test
    public void exampleTestCase()
    {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Training Support", title);
        driver.findElement(By.id("about-link")).click();

        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterClass
    public  void afterMethod()
    {
         driver.quit();
    }

}