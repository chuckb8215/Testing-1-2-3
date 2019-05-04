package RecordingTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Freetrial {

	public static void main(String[] args) {
		// 1. Open browser 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// 2. Navigate to the web application  https://shoppingcart-staging.avoxi.io/
		driver.get("https://shoppingcart-staging.avoxi.io/");
		driver.manage().window().maximize();
		
		// 3. Choose A Plan (Choose the Classic) 
		driver.findElement(By.id("businessStandardButton")).click();
		
		
		// 4. Select a Feature
		
		
		// 5. Enter in Customer Information
		driver.findElement(By.id("firstName")).sendKeys("Test");
		driver.findElement(By.id("lastName")).sendKeys("Human");
		driver.findElement(By.id("businessName")).sendKeys("IQ");
		driver.findElement(By.id("email")).sendKeys("iq@gmail.com");
		driver.findElement(By.id("newCustomerButton")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
			
		
		// 6. Enter in Payment Method
		WebElement Element = driver.findElement(By.id("billingName"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.findElement(By.id("billingName")).sendKeys("Test Human");
		
		driver.findElement(By.id("billingCardNumber")).sendKeys("370000000000002");
		
		driver.findElement(By.id("billingExpMon"));
		Select expMon = new Select(driver.findElement(By.id("billingExpMon")));
		expMon.selectByValue("8");
		
		driver.findElement(By.id("billingExpYear"));
		Select expYear = new Select(driver.findElement(By.id("billingExpYear")));
		expYear.selectByValue("2020");
		
		driver.findElement(By.id("billingCVC")).sendKeys("892");
		
		driver.findElement(By.id("finalCheckBox")).click();
		
		
		
		// 7. Place Order
		
		driver.findElement(By.id("placeOrder")).click();

	}

}
