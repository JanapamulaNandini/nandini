package swaglabsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CallingPOMBy {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\Nandu\\Downloads\\msedgedriver.exe");
		
		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		
		// importing POMBY class by creating object
		POM_BY p = new POM_BY();
		driver.findElement(p.username).sendKeys("standard_user");
		driver.findElement(p.password).sendKeys("secret_sauce");
		driver.findElement(p.login).click();
		driver.findElement(p.product).click();
		driver.findElement(p.checkout).click();
		driver.findElement(p.cartsymbol).click();
		driver.findElement(p.cart).click();
	}

}
