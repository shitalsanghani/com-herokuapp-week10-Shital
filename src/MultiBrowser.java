import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup multiple browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser
 */
public class MultiBrowser {

    static String browser = "firefox";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        // 1. Setup multiple browser
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //2.Open URL.
        driver.get(baseUrl);

        //3. Print the title of the page.
        System.out.println("The title of the page: " + driver.getTitle());

        //4. Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("The source of the page : " + driver.getPageSource());

        //6. Enter the email to email field.
        driver.findElement(By.id("username")).sendKeys("tomsmith ");

        //7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");

        //8. Click on Login Button.
        driver.findElement(By.tagName("i")).click();

        //9.Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        //10. Refresh the page.
        driver.navigate().refresh();

        //11. Close the browser
        driver.quit();
    }

}
