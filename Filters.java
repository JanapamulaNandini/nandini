package swaglabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Filters {

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
		//filter drop down
		WebElement filterdropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	    filterdropdown.click();
		Select filter = new Select(filterdropdown);
		//filter.selectByVisibleText("Name (Z to A)");
		filter.selectByVisibleText("Price (low to high)");
	}

}
