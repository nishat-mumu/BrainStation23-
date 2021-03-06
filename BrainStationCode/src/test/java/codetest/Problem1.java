package codetest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Problem1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				// Url Visit
				driver.get("https://www.phptravels.net/");
				
				driver.manage().window().maximize();
				// click on the tour tab
				driver.findElement(By.id("tours-tab")).click();
				
				Robot rb=new Robot();
				rb.delay(3000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.delay(1000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.delay(1000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.delay(1000);
				// Click on select on the city
				rb.keyPress(KeyEvent.VK_ENTER);
				
				driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Johor");		
			
				rb.delay(1000);
				// click the Johor city
				rb.keyPress(KeyEvent.VK_ENTER);

				rb.delay(1000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.delay(1000);
				rb.keyPress(KeyEvent.VK_TAB);

				/*rb.delay(3000);
				rb.keyPress(KeyEvent.VK_ENTER); */
				
				driver.findElement(By.xpath("//form[@id='tours-search']//a[@role='button']")).click();

				rb.delay(1000);
				rb.keyPress(KeyEvent.VK_TAB);
				
				rb.delay(1000);
				// Making adult count 2
				rb.keyPress(KeyEvent.VK_2);
				rb.delay(1000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.delay(1000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.delay(1000);
				//click on the search button
				rb.keyPress(KeyEvent.VK_ENTER);
				
				driver.findElement(By.id("cookie_stop")).click();
				//driver.findElement(By.cssSelector("li[id='legoland malaysia day pass'] span[class='ladda-label']")).click();
				
				//click on the details
				//driver.findElement(By.linkText("Details")).click();
				
				//alternative way
				driver.get("https://www.phptravels.net/en/usd/tour/johor-bahru/legoland-malaysia-day-pass/30/12-11-2021/2/0/1");
				//driver.findElement(By.xpath("//span[@class='ladda-label']")).click();
				
				//click on the book now button
				//driver.findElement(By.linkText("Book Now")).click();
				//driver.findElement(By.cssSelector("button[type='submit']")).click();
				
				/*First name textbox
				driver.findElement(By.name("firstname")).sendKeys("Nishat");
				
				//last name textbox
				driver.findElement(By.name("lastname")).sendKeys("Tasnim");
				
				//email textbox
				driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
				
				//phone number textbox
				driver.findElement(By.name("phone")).sendKeys("01234567");
				
				//address textbox
				driver.findElement(By.name("address")).sendKeys("Dhaka");
				
				//country dropdown
				Select Country = new Select(driver.findElement(By.id("select2-country_code-0w-container")));
				Country.selectByValue("Bangladesh");
				
				//nationality dropdown
				Select Nationality = new Select(driver.findElement(By.id("select2-nationality-5l-container")));
				Nationality.selectByValue("Bangladeshi");
				
				
				//traveller1 First name textbox
				driver.findElement(By.name("firstname_1")).sendKeys("Raju");
				
				//traveller1 last name textbox
				driver.findElement(By.name("lastname_1")).sendKeys("Khan");
				

				//traveller2 First name textbox
				driver.findElement(By.name("firstname_2")).sendKeys("Shizu");
				
				//traveller2 last name textbox
				driver.findElement(By.name("lastname_2")).sendKeys("Khan");
				
				//pay with bank transfer
				 driver.findElement(By.cssSelector("label[for='gateway_bank-transfer'] div[class='d-block']")).click();
				
				//click on the confirm booking button
				driver.findElement(By.linkText("Confirm Booking")).click();
				*/
				
				
				
				
				
				
				
	}

}
