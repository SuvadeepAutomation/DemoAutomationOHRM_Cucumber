import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Suvadeep_Workspace\\OrangeHRDemo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		Thread.sleep(5000);
		password.sendKeys("admin123");
		Thread.sleep(5000);
		loginbtn.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
