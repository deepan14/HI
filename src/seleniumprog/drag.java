package seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();

	driver.get("https://demoqa.com/droppable/");
	WebElement d =driver.findElement(By.id("draggable"));
	WebElement e=driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	act.clickAndHold(d).moveToElement(e).release().build().perform();                       
	
}
}
