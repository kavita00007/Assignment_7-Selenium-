import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormfillingAndValidation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/text-box");

		WebElement Name = driver.findElement(By.id("User_Name"));
		Name.sendKeys("Kavita Patil");
		
		WebElement Emailid = driver.findElement(By.id("User_Email"));
		Emailid.sendKeys("kavi2792@gmail.com");
		
		WebElement address1= (WebElement) driver.findElements(By.id("Current Address"));
		address1.sendKeys("Kothrud,Pune");
		
		WebElement address2= (WebElement) driver.findElements(By.id("Current Address"));
		address2.sendKeys("Bhadgaon,Jalgaon");
		
		WebElement submitform = driver.findElement(By.id("Submit"));
		submitform.click();
		
		WebElement nameEntry = driver.findElement(By.id("name"));
		String Name1 = nameEntry.getText();
		System.out.println(Name1);

		WebElement emailEntry = driver.findElement(By.id("email"));
		String Email1 = emailEntry.getText();
		System.out.println(Email1);

		String[] text = Name1.split(":");
		String[] email = Email1.split(":");
		
		System.out.println("User's Name is : " + text[1] + " "+ "\n" + "User's Email ID is : " + email[1]);
		
		if (text[1].equals("Kavita Patil") && email[1].equals("kavi2792@gmail.com"))
		{

			System.out.println("Correct");

		} else {

			System.out.println("Incorrect");

		}
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
