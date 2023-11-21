package movie;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Movie {

	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; //드라이버 ID
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver.exe"; //드라이버 경로
	
	public static void main(String[] args) {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		//이동을 원하는 url
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%83%81%EC%98%81%EC%98%81%ED%99%94";
		driver.get(url);
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		List<WebElement> el1 = driver.findElements(By.className("nav"));
		
		for (int i = 0; i < el1.size(); i++) {
			if(el1.get(i).getText().equals("뉴스")) {
				el1.get(i).click();
				break;
			}
		}
		
		//1초 대기
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		WebElement el2 = driver.findElement(By.id("section_it"));
		
		List<WebElement> el3 = el2.findElements(By.tagName("strong"));
		
		int count = 0;
		for (int i = 0; i < el3.size(); i++) {
			System.out.println(++count + "번 뉴스: "+ el3.get(i).getText());
		}
		
		
		try {
			if(driver != null) {
				driver.close(); 
				driver.quit();
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
