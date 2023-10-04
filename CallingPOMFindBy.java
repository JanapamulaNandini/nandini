package swaglabsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.PageFactory;

public class CallingPOMFindBy {

	public static void main(String[] args) {
		
System.setProperty("webdriver.edge.driver","C:\\Users\\Nandu\\Downloads\\msedgedriver.exe");
		
		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		
	   POMFindby p= PageFactory.initElements(driver, POMFindby.class);
	   p.username.sendKeys("standard_user");
	   p.password.sendKeys("secret_sauce");
	   p.login.click();
	   p.product.click();
	   p.cart.click();
	   p.removecart.click();
	   p.cartsymbol.click();
	   p.checkout.click();
	   p.firstname.sendKeys("radha");
	   p.lastname.sendKeys("krishna");
	   p.pincode.sendKeys("500000");
	   p.proceed.click();
	   p.finish.click();
	   p.backtoproducts.click();
	   
	   
	   
	   
	}
}
