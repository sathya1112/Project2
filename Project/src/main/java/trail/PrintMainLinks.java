package trail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMainLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=Angry+12+men&source=hp&ei=rIN6YNfmDqS_3LUPnqGjyA4&iflsig=AINFCbYAAAAAYHqRvH86ctyXHrtdWszuXuddCK5p5BJd&oq=Angry+12+men&gs_lcp=Cgdnd3Mtd2l6EANQoAFYyAFgth5oAHAAeAKAAWOIAdUCkgEBNJgBAKABAaoBB2d3cy13aXo&sclient=gws-wiz&ved=0ahUKEwjX7Kvd1oTwAhWkH7cAHZ7QCOkQ4dUDCAc&uact=5");
		//driver.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input").sendKeys("Angry 12 men");
		Thread.sleep(2000);
		/*driver.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span").click();
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		
		for(WebElement webelement:list){
			System.out.println(webelement.getAttribute("href"));
		}*/
		
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='rcnt']//following::h3//following::div/cite"));
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			
		}

	}

}
