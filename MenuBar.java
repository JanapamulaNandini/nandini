package swaglabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MenuBar {

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
		//menu bar
        driver.findElement(By.id("react-burger-menu-btn")).click();
        //"about" functionality
        //driver navigate.backward
        driver.findElement(By.id("about_sidebar_link")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //logout
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(2000);
        //login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        }

}
