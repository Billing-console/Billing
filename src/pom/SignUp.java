package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
 
public class SignUp {
    By firstName = By.name("firstname");
    By surName = By.name("lastname");
    By emailOrNumber = By.name("reg_email__");
    By newPassword = By.id("password_step_input");
    By day = By.id("day");
    By month = By.id("month");
    By year = By.id("year");
    By female = By.name("sex");
    By male = By.xpath("//*[@id=\"u_0_w_fu\"]/span[2]/label");
    By custom = By.xpath("//*[@id=\"u_0_w_fu\"]/span[3]/label");
    By signupbtn = By.name("websubmit");
    private WebDriver driver;
    public SignUp(WebDriver driver) {
         /* "this" keyword is used here to distinguish global
        and local variable "driver"*/
        /*gets driver as parameter from MainClass.java and assigns
        to the driver instance in this class*/
        this.driver = driver;
    }
    // method to type firstname
    public void enterfirstName() {
    	if( driver.findElement(firstName).isDisplayed()) {
    		System.out.println("First name box is present");
    		 driver.findElement(firstName).sendKeys("Abh");
    	}
       
    }
    // method to type username
    public void entersurName() {
    	if(driver.findElement(surName).isDisplayed()) {
    		System.out.println("surname box is present");
    		driver.findElement(surName).sendKeys("rig");
    	}
        
    }
    // method to type email or number
    public void enteremailOrNumber() {
    	if(driver.findElement(emailOrNumber).isDisplayed()) {
    		System.out.println("Email or number box is present");
    		 driver.findElement(emailOrNumber).sendKeys("9998855413");
    	}
       
    }
    // method to type password
    public void enternewPassword() {
    	if(driver.findElement(newPassword).isDisplayed()) {
    		System.out.println("New password box is present");
    		driver.findElement(newPassword).sendKeys("123445678");
    	}
        
    }
    // method to select day
    public void clickday() {
    	if(driver.findElement(day).isEnabled()) {
    		System.out.println("Day drop down is enabled");
    		driver.findElement(day).click();
    	}
        
    }
    public void selectday() {
        Select drop1 = new Select(driver.findElement(By.id("day")));
        drop1.selectByIndex(0);
    }
    // method to select month
    public void clickmonth() {
    	if(driver.findElement(month).isEnabled()) {
    		System.out.println("Month drop down is enabled");
    		driver.findElement(month).click();
    	}
        
    }
    public void selectmonth() {
        Select drop2 = new Select(driver.findElement(By.id("month")));
        drop2.selectByIndex(2);
    }
    // methos to select year
    public void clickyear() {
    	if(driver.findElement(year).isEnabled()) {
    		System.out.println("Year dropdown is enabled");
    		 driver.findElement(year).click();
    	}
       
    }
    public void selectyear() {
        Select drop3 = new Select(driver.findElement(By.id("year")));
        drop3.selectByIndex(7);
    }
    // method to select gender
    public void selectgender() {
    	if(driver.findElement(female).isEnabled()) {
    		System.out.println("Female radio button is enabled");
    		driver.findElement(female).click();
    	}
        
    }
    // method to click signup
    public void clicksignupbtn() {
    	if(driver.findElement(signupbtn).isEnabled()) {
    		System.out.println("sign up button is enabled");
    		 driver.findElement(signupbtn).click();
    	}
       
    }
}
