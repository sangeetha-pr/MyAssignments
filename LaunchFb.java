package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchFb {
	public static void main(String[] args) {
		
		// To launch browser
		ChromeDriver driver =new ChromeDriver();
		
		// To launch URL
		driver.get("https://www.facebook.com/");
		
		// To max
        driver.manage().window().maximize();
       
       
        WebElement email = driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
       
       driver.findElement(By.linkText("Forgotten password?")).click();
        // to get title
        System.out.println(driver.getTitle());
        
       //To close
      //driver.close();
}
}