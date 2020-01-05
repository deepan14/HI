package seleniumprog;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class owntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
WebElement v =driver.findElement(By.xpath("(//li//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category'])[2]"));
	Actions k=new Actions(driver);
	k.moveToElement(v).build().perform();
	//v.click();
	WebElement kk=driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
	kk.click();
	
//WebElement m=	driver.findElement(By.xpath("( //a[@href='http://automationpractice.com/index.php?id_category=10&controller=category'])[3]"));
// m.click();
	driver.findElement(By.id("layered_id_attribute_group_1")).click();
	boolean m2=driver.findElement(By.id("layered_id_attribute_group_1")).isDisplayed();	
	System.out.println(m2);
	boolean m1=driver.findElement(By.id("layered_id_attribute_group_1")).isEnabled();	
	System.out.println(m1);
	driver.findElement(By.id("search_query_top")).sendKeys("dress");
	driver.findElement(By.name("submit_search")).click();
	driver.findElement(By.linkText(""));
	
	

	
	}

}
