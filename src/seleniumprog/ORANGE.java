package seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORANGE {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.manage().window().maximize();
	 driver.navigate().refresh();
	String a=driver.getTitle();
System.out.println(a);
String b=driver.getCurrentUrl();
System.out.println(b);
/* String c=driver.getPageSource();  
System.out.println(c);
driver.close();*/

WebElement d= driver.findElement(By.id("txtUsername"));
d.sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
WebElement e=driver.findElement(By.id("welcome"));
String f=e.getText();
System.out.println(f);


	
}
}
