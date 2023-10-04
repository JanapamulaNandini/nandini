package swaglabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SaucelabsBagpack {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Nandu\\Downloads\\msedgedriver.exe");
		
		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		//Login page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		//sauce Labs Backpack Product
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		Thread.sleep(2000);
		//Add to Cart functionality
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		//Remove from cart
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		//Cart symbol functionality
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);
		//checkout functionality
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		//checkout details
		driver.findElement(By.id("first-name")).sendKeys("radha");
		driver.findElement(By.id("last-name")).sendKeys("krishna");
		driver.findElement(By.id("postal-code")).sendKeys("500000");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
	}

}
