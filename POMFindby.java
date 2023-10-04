package swaglabsProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMFindby {

	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement login;
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")WebElement product;
	@FindBy(id="add-to-cart-sauce-labs-backpack")WebElement cart;
	@FindBy(id="remove-sauce-labs-backpack")WebElement removecart;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement cartsymbol;
	@FindBy(id="checkout")WebElement checkout;
	@FindBy(id="first-name")WebElement firstname;
	@FindBy(id="last-name")WebElement lastname;
	@FindBy(id="postal-code")WebElement pincode;
	@FindBy(id="continue")WebElement proceed;
	@FindBy(id="finish")WebElement finish;
	@FindBy(id="back-to-products")WebElement backtoproducts;
	
	
	}


