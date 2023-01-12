package Sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonScenPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).click();
		String text = driver.findElement(By.xpath("//div[@class='_octopus-search-result-card_style_apbSearchResultItem__2-mx4'][4]//div/div[3]/div[3]/div[2]/a/span[1]/span")).getText();
		System.out.println(text);

	}

}
