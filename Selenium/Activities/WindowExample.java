package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WindowExample {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //open page
        driver.get("https://v1.training-support.net/selenium/tab.opener");
        //print the page title
        System.out.println("Page title is: " + driver.getTitle());
        //Get the current window handle
        System.out.println("Current window handle is: " + driver.getWindowHandle());
        //Find and click the button to open a new tab
        driver.findElement(By.id("launcher")).click();
        //print the current window handle
        System.out.println(driver.getWindowHandles());
        //Switch Selenium is the newest tab
        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        //print the title and the handle of the new tab
        System.out.println("page title is: " + driver.getTitle());
        System.out.println("Current window handle is: " + driver.getWindowHandles());

        //Close the browser
        driver.quit();



    }
}
