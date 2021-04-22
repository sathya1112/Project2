package trail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesuggessionclick2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input").sendKeys("Game of Thrones");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		for(WebElement webElement:list){
			String text=webElement.getText();
			System.out.println(text);
			
			if(text.contains("cast")){
				webElement.click();
				break;
			}
		}
	}

}

