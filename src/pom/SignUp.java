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
        driver.findElement(firstName).sendKeys("Abh");
    }
    // method to type username
    public void entersurName() {
        driver.findElement(surName).sendKeys("rig");
    }
    // method to type email or number
    public void enteremailOrNumber() {
        driver.findElement(emailOrNumber).sendKeys("9998855413");
    }
    // method to type password
    public void enternewPassword() {
        driver.findElement(newPassword).sendKeys("123445678");
    }
    // method to select day
    public void clickday() {
        driver.findElement(day).click();
    }
    public void selectday() {
        Select drop1 = new Select(driver.findElement(By.id("day")));
        drop1.selectByIndex(0);
    }
    // method to select month
    public void clickmonth() {
        driver.findElement(month).click();
    }
    public void selectmonth() {
        Select drop2 = new Select(driver.findElement(By.id("month")));
        drop2.selectByIndex(2);
    }
    // methos to select year
    public void clickyear() {
        driver.findElement(year).click();
    }
    public void selectyear() {
        Select drop3 = new Select(driver.findElement(By.id("year")));
        drop3.selectByIndex(7);
    }
    // method to select gender
    public void selectgender() {
        driver.findElement(female).click();
    }
    // method to click signup
    public void clicksignupbtn() {
        driver.findElement(signupbtn).click();
    }
}
