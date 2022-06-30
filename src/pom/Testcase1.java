package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Testcase1 {
    @Test
    public void verifyLogin() {
    // setting property for the driver
    System.setProperty("webdriver.chrome.driver",
    "C:\\Users\\HCLTSS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    // initializing the chrome driver
    WebDriver driver = new ChromeDriver();
    // opening the application
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    // maximizing the driver tab
    driver.manage().window().maximize();
 
    SignUp sup=new SignUp(driver);
    // methods from SignUp class
    sup.enterfirstName();
    sup.entersurName();
    sup.enteremailOrNumber();
    sup.enternewPassword();
    sup.clickday();
    sup.selectday();
    sup.clickmonth();
    sup.selectmonth();
    sup.clickyear();
    sup.selectyear();
    sup.selectgender();
    sup.clicksignupbtn();
 
    }
}
