package facebook;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class LoginDDT {
        WebDriver driver;
        Workbook wb;
        Sheet sh;
        int numrow;
        String uname;
        String pwd;

        @BeforeTest
        public void setup() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\HCLTSS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("https://www.facebook.com/login.php");
            driver.manage().window().maximize();

        }
        @Test (dataProvider="testdata")
        public void verify(String uname, String pwd) throws InterruptedException {
            driver.findElement(By.name("email")).sendKeys(uname);
            driver.findElement(By.name("pass")).sendKeys(pwd);
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
            Thread.sleep(5000);
            if(driver.getTitle().contains("Log in to Facebook")) {
                driver.navigate().refresh();
            }
        }
        @DataProvider(name="testdata")
        public Object[][] TestDataFeed(){

            try {

                wb = Workbook.getWorkbook(new File("C:\\Users\\HCLTSS\\Desktop\\Book1.xls"));
                sh = wb.getSheet(0);
                numrow = sh.getRows();
            } catch (Exception e) {
                e.printStackTrace();

            }
            Object[][] fbdata = new Object[numrow][sh.getColumns()];
            for (int i = 0; i < numrow; i++) {
            fbdata[i][0] = sh.getCell(0, i).getContents();
                fbdata[i][1] = sh.getCell(1, i).getContents();
            }
            return fbdata;
        }
}