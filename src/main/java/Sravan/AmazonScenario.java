package Sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonScenario {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		String txt = driver.findElement(By.xpath("//div[@class='a-section a-spacing-medium _octopus-search-result-card_style_apbSearchResultsContainer__bCqjb']/div[4]/div/div/div/div/div/span[2]")).getText();
		System.out.println(txt);

	}

}
