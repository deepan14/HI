package seleniumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://adactin.com/HotelApp/");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		String a=driver.getTitle();
	 System.out.println(a);
	// String b=driver.getCurrentUrl();
	// System.out.println(b);
 WebElement d= driver.findElement(By.id("username"));
d.sendKeys("deepan123");
driver.findElement(By.id("password")).sendKeys("deepan123");
driver.findElement(By.id("login")).click();
WebElement e=driver.findElement(By.id("username_show"));
String f=e.getText();
System.out.println(f);
WebElement g=driver.findElement(By.name("location"));
	 Select se=new Select(g);
	 se.selectByIndex(2);
	WebElement h=driver.findElement(By.name("hotels"));
	 Select se1=new Select(h);
	 List<WebElement>k=se1.getOptions();
for(WebElement t:k)
{	System.out.println(t.getText());}


	}

}
