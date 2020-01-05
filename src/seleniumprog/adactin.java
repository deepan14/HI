package seleniumprog;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adactin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://adactin.com/HotelApp/");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
String a=driver.getTitle();
System.out.println(a);
//String b=driver.getCurrentUrl();
//System.out.println(b);
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
	 se1.selectByIndex(2);
		WebElement i=driver.findElement(By.name("room_type"));
		 Select se2=new Select(i);
		 se2.selectByIndex(3);
		WebElement k=driver.findElement(By.name("room_nos"));
		Select se3=new Select(k);
		 se3.selectByIndex(3);
		
		WebElement l=driver.findElement(By.id("datepick_in"));
		l.clear();
		l.sendKeys("07/11/2019");
		
		WebElement h1=driver.findElement(By.id("datepick_out"));
		h1.clear();
		h1.sendKeys("08/11/2019");
	WebElement k1=driver.findElement(By.name("adult_room"));
	Select se5= new Select(k1);
	se5.selectByIndex(2);
	WebElement k2=driver.findElement(By.name("child_room"));
	 Select se6=new Select(k2);
	 se6.selectByVisibleText("2 - Two");
	 driver.findElement(By.id("Submit")).click();
	 driver.findElement(By.id("radiobutton_0")).click();
	 driver.findElement(By.id("continue")).click();
	 driver.findElement(By.id("first_name")).sendKeys("Deepan");
	 driver.findElement(By.id("last_name")).sendKeys("R");
	 driver.findElement(By.id("address")).sendKeys("60b ch-97");
	 driver.findElement(By.id("cc_num")).sendKeys("0120120120120122"); 
	 WebElement j=driver.findElement(By.name("cc_type"));
	 Select se8=new Select(j);
	 se8.selectByIndex(1);
WebElement j21=driver.findElement(By.name("cc_exp_month"));
Select j2=new Select(j21);
j2.selectByIndex(11);	 
WebElement j22=driver.findElement(By.name("cc_exp_year"));
Select j3=new Select(j22);
j3.selectByIndex(5);	
driver.findElement(By.id("cc_cvv")).sendKeys("123");
driver.findElement(By.id("book_now")).click();
WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
WebElement l1=driver.findElement(By.id("order_no"));
String t=l1.getAttribute("value");
System.out.println(t);

driver.findElement(By.id("my_itinerary")).click();
//List<WebElement> row=driver.findElements(By.xpath("//table//tr//tr"));
// for(WebElement e1:row) {
//	  List<WebElement> data=e1.findElements(By.xpath(".//input"));
//	 for(WebElement e2:data) {
//		 System.out.println(e2.getAttribute("value"));
//	 }
//}


// WebElement dee=driver.findElement(By.xpath("id=\"btn_id_323341\""));
// dee.click();
// driver.findElement(By.id("alret"));
//Alert al=driver.switchTo().alert();
//al.accept();
//input[@value='Cancel YRGMI6AKK9']

String beforexpath="//input[@value='Cancel ";
String aftexpath="']";
String actualxpath=beforexpath+t+aftexpath;

	//driver.findElement(By.xpath("(//input[@name='ids[]'])[31]")).click();
	//driver.findElement(By.xpath("//input[@name='cancelall']")).click();
driver.findElement(By.xpath(actualxpath)).click();
	Alert cl=driver.switchTo().alert();
	cl.accept();
	
	
	
	
	
	}
	
	
	

	}


