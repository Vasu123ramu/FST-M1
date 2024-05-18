package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
        import java.time.Duration;


public class Activityselenium9 {
    public static void main(String[] args) {
        // Setup the driver
        WebDriverManager.firefoxdriver().setup();
        // Driver object reference
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/ajax");

        System.out.println(" page title is  " + driver.getTitle());
        driver.findElement(By.className("violet")).click();
        String heading1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();
        System.out.println("New heading is: " + heading1);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I 'm late"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Delayed text is: " + lateText);

        driver.quit();
    }
}
