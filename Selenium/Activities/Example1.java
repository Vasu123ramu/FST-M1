package examples;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1
{
    public static void main(String[] args) throws InterruptedException {
        //Get the  GeckoDriver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        // Open the page
        driver.get("https://training-support.net/");
        // print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Home page title: " + pageTitle);
        // Find the About us link and click it
        Thread.sleep(2000);
        driver.findElement(By.linkText("About Us")).click();
        // Print the title of new page
        Thread.sleep(2000);
        String newPageTitle = driver.getTitle();
        System.out.print("about Us page title is " + newPageTitle);
        Thread.sleep(2000);
        // Close the browser
        driver.quit();
    }
}

