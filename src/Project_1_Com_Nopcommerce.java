import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 */
public class Project_1_Com_Nopcommerce {
    static String baseUrl = "https://demo.nopcommerce.com";

   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //1.set up Chrome browser
        WebDriver driver = new ChromeDriver();
        //2. open Url
        driver.get(baseUrl);
        //3.print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //4.print the current url
        System.out.println("The current Url: " + driver.getCurrentUrl());
        //5.print the page source
        System.out.println(driver.getPageSource());
        //6.Navigate to Url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        //7.print the current url
        System.out.println("Get Current Url " + driver.getCurrentUrl());

        Thread.sleep(5000);
        //8.navigate back to the homepage
        driver.navigate().to(baseUrl);
        //9.Navigate to the login page
        driver.navigate().to(loginUrl);
        //10.Print Current Url
        System.out.println("Get Current Url " + driver.getCurrentUrl());
        //11.Refresh the page
        driver.navigate().refresh();
        //12.Enter the email to email field
    WebElement emailLink = driver.findElement(By.id("Email"));
    emailLink.sendKeys("abc@gmail.com");
        //13.Enter the password to password field
      WebElement passwordLink = driver.findElement(By.name("Password"));
      passwordLink.sendKeys("abc123");
        //14.click on log in button
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //15.Close the browser
        driver.quit();






    }
}
