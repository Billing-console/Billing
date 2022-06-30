package cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompatabilityTesting {
	 public static boolean usernamePresent,passwordPresent,loginbtnPresent,facebookIconPresent;
	    @Test
	    @Parameters("Browser")
	    public void test1(String browser) {
	        WebDriver driver;
	      
			if (browser.equalsIgnoreCase("Chrome")) {
				// setting property for chrome driver
	            System.setProperty("webdriver.chrome.driver",
	                    "C:\\Users\\HCLTSS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	            // initializing the chrome driver
	            driver = new ChromeDriver();
	            // opening the application
	            driver.get("https://www.facebook.com/login.php");
	            // maximizing the window
	            driver.manage().window().maximize();

	            // checking the username textbox is present 
	     usernamePresent=driver.findElement(By.id("email")).isDisplayed();
	            if(usernamePresent) {
	            	System.out.println("Username box is present");
	            	// typing the email id 
	            	driver.findElement(By.id("email")).sendKeys("Automationtesting387@gmail.com");
	            }
	            // checking the password text box is present
	     passwordPresent=driver.findElement(By.id("pass")).isDisplayed();
	            if(passwordPresent) {
	            
	            	System.out.println("password box is present");
	            // typing the password in the text box
	            	 driver.findElement(By.id("pass")).sendKeys("Facebook@1234");
	            }
	            // checking the login button is present 
	     loginbtnPresent=driver.findElement(By.id("loginbutton")).isDisplayed();
	            if(loginbtnPresent) {
	            	System.out.println("Login button is enabled");
	            	driver.findElement(By.id("loginbutton")).click();
	            }
	    
	        }
	        else if (browser.equalsIgnoreCase("edge")) {
	            System.setProperty("webdriver.edge.driver","C:\\Users\\HCLTSS\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
	            driver = new EdgeDriver();
	            // opening the application
	            driver.get("https://www.facebook.com/login.php");
	            // maximizing the window
	            driver.manage().window().maximize();

	            // checking the username textbox is present 
	     usernamePresent=driver.findElement(By.id("email")).isDisplayed();
	            if(usernamePresent) {
	            	System.out.println("Username box is present");
	            	// typing the email id 
	            	driver.findElement(By.id("email")).sendKeys("Automationtesting387@gmail.com");
	            }
	            // checking the password text box is present
	     passwordPresent=driver.findElement(By.id("pass")).isDisplayed();
	            if(passwordPresent) {
	            
	            	System.out.println("password box is present");
	            // typing the password in the text box
	            	 driver.findElement(By.id("pass")).sendKeys("Facebook@1234");
	            }
	            // checking the login button is present 
	     loginbtnPresent=driver.findElement(By.id("loginbutton")).isDisplayed();
	            if(loginbtnPresent) {
	            	System.out.println("Login button is enabled");
	            	driver.findElement(By.id("loginbutton")).click();
	            }
	        }
	       
	    }
}
