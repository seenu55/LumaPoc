package StepDefPackage;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BasePackage.BaseClassdomo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClassLuma extends BaseClassdomo  {
	
	@Given("User Launch URL")
	public void user_launch_url() {
		getURL("https://magento.softwaretestingboard.com/");
	}


	@When("User Sing in the account Valid Email and Password")
	public void user_sing_in_the_account_valid_email_and_password() {
		driver.findElement(By.xpath("(//li[@class=\"authorization-link\"])[1]")).click();
		driver.findElement(By.id("email")).sendKeys("rohitkarthi1996@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Mskarthi@07");
		
	    
	}

	@Then("User Click the Sign in Button")
	public void user_click_the_sign_in_button() {
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).submit();
		
		   
   }
	
	@Then("User click on Women dress and select the tops option and select the jackets option")
	public void user_click_on_women_dress_and_select_the_tops_option_and_select_the_jackets_option() {
		WebElement women=driver.findElement(By.id("ui-id-4"));
		Actions action=new Actions(driver);
		action.moveToElement(women).perform();
		WebElement womenstop=driver.findElement(By.id("ui-id-9"));
		Actions action1=new Actions(driver);
		action1.moveToElement(womenstop).perform();
		driver.findElement(By.id("ui-id-11")).click();
			
		
	}

	@Then("User Click first jackets to add to wish list")
	public void user_click_first_jackets_to_add_to_wish_list() {
		WebElement womens=driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(womens).perform();
		driver.findElement(By.xpath("(//a[@class=\"action towishlist\"])[2]")).click();
		
		
	}

	@Then("User Click to add cart for jackets")
	public void user_click_to_add_cart_for_jackets() {
		WebElement addcart=driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"][1])"));
		Actions action=new Actions(driver);
		action.moveToElement(addcart).perform();
		driver.findElement(By.xpath("(//span[text()=\"Add to Cart\"])[1]")).click();
		
		
	}
	
	@Then("User Select the size and colour then add to add to cart the jackets")
	public void user_select_the_size_and_colour_then_add_to_add_to_cart_the_jackets() throws Exception {
	    driver.findElement(By.id("option-label-size-143-item-168")).click();
	    driver.findElement(By.id("option-label-color-93-item-53")).click();
	    driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	    Thread.sleep(3000);
	    
	}

	@Then("User Click Men dress and select the Bottom option and select the shorts option")
	public void user_click_men_dress_and_select_the_bottom_option_and_select_the_shorts_option() throws Exception {
		Thread.sleep(2000);
		WebElement menoption = driver.findElement(By.id("ui-id-5"));
		Actions action1=new Actions(driver);
		action1.moveToElement(menoption).perform();
		WebElement menbottom=driver.findElement(By.id("ui-id-18"));
		Actions action2=new Actions(driver);
		action2.moveToElement(menbottom).perform();
		driver.findElement(By.id("ui-id-24")).click();
	
	}
	
	@Then("User click first shorts to add to wish list")
	public void user_click_first_shorts_to_add_to_wish_list() {
		WebElement mens=driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[3]"));
		Actions action2=new Actions(driver);
		action2.moveToElement(mens).perform();
		driver.findElement(By.xpath("(//a[@class=\"action towishlist\"])[2]")).click();

	   
	}
	

	@Then("User Click to add cart for shorts")
	public void user_click_to_add_cart_for_shorts() throws Exception {
		WebElement addcart1=driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(addcart1).perform();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
		Thread.sleep(3000);
	
	}
	
	@Then("User Select the size and colour then add to add to cart the shorts")
	public void user_select_the_size_and_colour_then_add_to_add_to_cart_the_shorts() {
		driver.findElement(By.id("option-label-size-143-item-176")).click();
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("3");
		driver.findElement(By.id("product-addtocart-button")).click();
	}

	@Then("User Click Shopping cart and edit jackets quantity then checkout")
	public void user_click_shopping_cart_and_edit_jackets_quantity_then_checkout() throws Exception {
		driver.findElement(By.xpath("//a[text()=\"shopping cart\"]")).click();
		Thread.sleep(3000);
		JavascriptExecutor javascr= (JavascriptExecutor) driver;
		javascr.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		TakesScreenshot TSS = (TakesScreenshot) driver;
		File source = TSS.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\seenu\\eclipse-workspace\\LumaKarthik\\ScreenShot\\karthik.png");
		FileUtils.copyFile(source, destination);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();

	    
	}

	@Then("User Click Shipping methods and click next and place order")
	public void user_click_shipping_methods_and_click_next_and_place_order() throws Exception {
		JavascriptExecutor javascr= (JavascriptExecutor) driver;
	    javascr.executeScript("window.scrollBy(0,300)");
	    driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
	    driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class=\"action primary checkout\"]")).click();
	    Thread.sleep(3000);
	    TakesScreenshot TSS = (TakesScreenshot) driver;
		File source = TSS.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\seenu\\eclipse-workspace\\LumaKarthik\\ScreenShot\\karthik2.png");
		FileUtils.copyFile(source, destination);
	    driver.findElement(By.xpath("//a[@class=\"action print\"]")).click();
	    
	}

	@Then("User Click Print Option")
	public void user_click_print_option()throws InterruptedException, AWTException {
		Set<String> windows = driver.getWindowHandles();
		List<String> windowsHandles = new ArrayList(windows);
		
		driver.switchTo().window(windowsHandles.get(1));
		Thread.sleep(2000);
		
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.close();
           
        driver.switchTo().window(windowsHandles.get(0));
        Thread.sleep(2000);
        driver.quit();
		
		
	}

}
