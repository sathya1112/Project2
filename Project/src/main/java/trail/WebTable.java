package trail;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("buttonFromTo").click();
		WebElement table=driver.findElementByTagName("table");
		table.findElement(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr[3]/td[2]/a")).click();

		java.util.List<WebElement>list=table.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr"));
		
		for(int i=1;i<=list.size();i++){
			if(i!=14){
			String train=table.findElement(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr["+i+"]/td[2]/a")).getText();
			System.out.println(train);
		}
			}
	}

}
