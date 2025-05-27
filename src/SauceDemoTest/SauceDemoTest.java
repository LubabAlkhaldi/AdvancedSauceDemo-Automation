package SauceDemoTest;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemoTest{

	WebDriver driver = new EdgeDriver();
    String URL = "https://www.saucedemo.com/";

    // Open website and maximize window
	@BeforeTest
	public void Setup(){
	    driver.get(URL);
	    driver.manage().window().maximize();
	}

    // Login with standard user account
	@Test(priority = 1)
	public void Login(){
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();	
	}

    // Add random items to cart
	@Test(priority = 2)
	public void AddRandomlyItems() throws InterruptedException{
	    List<WebElement> addButtons = driver.findElements(By.xpath("//button[text()='Add to cart']"));
	    Collections.shuffle(addButtons);

	    Random random = new Random();
	    int numberToAdd = random.nextInt(2) + 2;

	    for (int i = 0; i < numberToAdd; i++){
	        addButtons.get(i).click();
	        Thread.sleep(500); 
	    }

	    WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
	    System.out.println("Items added to cart: " + cartBadge.getText());
	}

    // Complete checkout and confirm order
	@Test(priority = 3)
	public void Checkout() throws InterruptedException{
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("Lubab");
	    driver.findElement(By.id("last-name")).sendKeys("Alkhaldi");
	    driver.findElement(By.id("postal-code")).sendKeys("12345");
	    driver.findElement(By.id("continue")).click();
	    Thread.sleep(1000);

	    driver.findElement(By.id("finish")).click();
	    Thread.sleep(2000);

	    WebElement successMsg = driver.findElement(By.className("complete-header"));
	    if (successMsg.getText().equals("Thank you for your order!")){
	        System.out.println("Checkout completed successfully!");
	    } 
	    else{
	        System.out.println("Checkout failed.");
	    }
	    
	    // driver.quit();	    
	}
}