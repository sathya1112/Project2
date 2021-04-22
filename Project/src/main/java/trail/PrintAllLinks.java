package trail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input").sendKeys("Angry 12 men");
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span").click();
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		
		for(WebElement webelement:list){
			System.out.println(webelement.getAttribute("href"));
		}
		

	}

}
