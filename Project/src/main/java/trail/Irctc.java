package trail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		Thread.sleep(1000);
		WebElement nat=driver.findElementByXPath("//*[@id='ui-tabpanel-1']/div/div[13]/select");
		Select sel=new Select(nat);
		sel.selectByVisibleText("Andorra");
		Thread.sleep(1000);
		WebElement a=driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[1]/span[1]/strong");
		String b=a.getText();
		System.out.println(b);
		
		
		
		
	}

}
