package fetchAttributeValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchAttribute
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Thread.sleep(2000);
		String attribute = ele.getAttribute("title");
		System.out.println(attribute);
		driver.quit();
	}

}