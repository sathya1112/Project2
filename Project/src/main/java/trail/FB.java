package trail;

import java.util.Set;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		String winId1=driver.getWindowHandle();
		driver.findElementById("tryhome").click();
		Thread.sleep(1000);
		Set<String>allWinId=driver.getWindowHandles();
		for(String eachId:allWinId){
			driver.switchTo().window(eachId);
		}
		driver.findElementByXPath("//*[@id='main']/div[1]/div[1]/a[1]").click();
		Thread.sleep(1000);
		String winId2=driver.getWindowHandle();
		driver.switchTo().window(winId1);
		Thread.sleep(1000);
		driver.findElementById("tryhome").click();
		String winId3=driver.getWindowHandle();
		Thread.sleep(1000);
		for(String eachId:allWinId){
			driver.switchTo().window(eachId);
		}
		
		Thread.sleep(3000);
		driver.switchTo().window(winId2);
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
