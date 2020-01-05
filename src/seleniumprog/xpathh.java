package seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		// driver.findElement(By.xpath("(//a[@href=\"http://automationpractice.com/index.php?id_category=8&controller=category\"])[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		// driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 //Boolean dis=driver.findElement(By.xpath("//div[@class=\"content_scene_cat_bg\"]")).isEnabled();
     //System.out.println(dis);
		 
//       Boolean dis=driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
//       System.out.println(dis);
//       Boolean k=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
//       System.out.println(k);
//       Boolean u=driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
//       System.out.println(u);
       
       //(//a[@title='T-shirts'])[2]
       
       
	}


}
