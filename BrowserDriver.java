package week2.day1;
import 	org.openqa.selenium.chrome.ChromeDriver;
public class BrowserDriver {
	public static void main(String[] args) {
		// To launch broswer
		ChromeDriver driver =new ChromeDriver();
		// To launch URL
		driver.get("https://www.facebook.com/");
		// To max
        driver.manage().window().maximize();
        // To close
        //driver.close();

	}

}
