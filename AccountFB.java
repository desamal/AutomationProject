package ra.edge.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AccountFB {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\papu\\Desktop\\New folder (5)\\New folder (3)\\LatestedEdgeAuto\\browsers\\chromedriver.exe");	
WebDriver  driver=new ChromeDriver();

driver.get("https://en-gb.facebook.com/login");






//driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]")).click();


driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("gulu");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gulu123");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gb12@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("gb12@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456");
Thread.sleep(1000);
WebElement day=driver.findElement(By.id("day"));
Thread.sleep(1000);
WebElement month=driver.findElement(By.id("month"));
Thread.sleep(1000);
WebElement year=driver.findElement(By.id("year"));

Select select =new Select(day);
select.selectByVisibleText("10");

Select select1 =new Select(month);
select1.selectByIndex(11);

Select select2 =new Select(year);
select2.selectByValue("2014");

driver.findElement(By.xpath("//input[@name='sex'and @value=1]")).click();

driver.findElement(By.xpath("//button[@name='websubmit']")).click();




	}


	}


