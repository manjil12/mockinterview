package DAY1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mockinterview1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ghimi\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
		driver.manage().window().maximize();
		
		//creating firstname,lastname,email and password
		driver.findElement(By.cssSelector("#customer-first-name")).sendKeys("Manjil");
		driver.findElement(By.cssSelector("#customer-last-name")).sendKeys("Ghimire");
		driver.findElement(By.cssSelector("#customer-email")).sendKeys("ghi_man@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/form/div[4]/input")).sendKeys("Abc2022!");
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/form/a")).click();		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ghi_man@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Abc2022!");
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/form/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//purchasing an items
		driver.findElement(By.xpath("//*[@id=\"vue-app-account\"]/div/header/div/div/div[3]/a[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@class=\"absolute top-2 right-2\"])")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[3]/div/div/div[3]/a/p")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div[3]/div[2]/div[1]/div[1]/a/div/span/span/picture/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div[2]/div/div/div[5]/div/div/div/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div[2]/div/div/div[6]/div/button")).click();
		driver.findElement(By.cssSelector("#root > div > header > div.fixed.w-screen.h-screen.transform.z-50.translate-x-0 > div > div.sticky.bottom-0.w-full.px-6.py-4.border-t.border-grey.bg-main-0 > a")).click();
		
		//Checking out process
//		driver.findElement(By.xpath("//*[@id=\"one\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"variantListings\"]/div/div/div/div[2]/div/div[2]/input")).sendKeys("51 usa road");
//		driver.findElement(By.xpath("//*[@id=\"locality\"]")).sendKeys("San Francisco");
//		WebElement drop = driver.findElement(By.xpath("//*[@id=\"variantListings\"]/div/div/div/div[2]/div/div[4]/div[2]/div/select"));
//		Select State = new Select(drop);
//		State.selectByValue("CA");
//		driver.findElement(By.xpath("//*[@id=\"variantListings\"]/div/div/div/div[2]/div/div[4]/div[3]/input")).sendKeys("12345");
//		driver.findElement(By.xpath("//*[@id=\"save-button\"]")).click();
		
		//putting credit card info
//		driver.findElement(By.xpath("//label[contains(@for, 'credit-card')]")).click();
//		WebElement  e =driver.findElement(By.xpath("//iframe[contains(@title, 'Secure card payment input frame')]"));
//		driver.switchTo().frame(e);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).sendKeys("4242424242424242");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span/span/input")).sendKeys("11/24");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[3]/span/span/input")).sendKeys("234");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[4]/span/span/input")).sendKeys("12345");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.xpath("//*[@id=\"stripe-button\"]")).click();
	
	
		//adding coupons
		driver.findElement(By.xpath("//*[@id=\"webstore-cart-wrapper\"]/div[3]/div[2]/section/div[2]/section/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"variantListings\"]/div/div/div/div[2]/div[2]/input")).sendKeys("1TIMEONLY");
		driver.findElement(By.id("save-button")).click();
		
		//submit payment
		driver.findElement(By.xpath("//*[@id=\"webstore-cart-wrapper\"]/div[3]/div[2]/section/div[2]/div/div[2]/div/button")).click();
		
		//logout
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"vue-app-checkout-success\"]/div/div/a")).click();
		driver.quit();
		
		
		
		
	}

}
