package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activityselenium1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        // Open the page
        driver.get("https://training-support.net/");

        String pageTitle = driver.getTitle();
        System.out.println("Home page title: " + pageTitle);

        driver.findElement(By.linkText("About Us")).click();

        String newPageTitle = driver.getTitle();
        System.out.print("about Us page title is " + newPageTitle);

        driver.quit();
    }
}
