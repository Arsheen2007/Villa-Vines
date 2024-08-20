package Villa;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class App {
	public WebDriver driver;
    
    @Test
	public void setUp() throws InterruptedException {
    	
     
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.villasandvines.co.nz/");
        Thread.sleep(1000);
        
        System.out.println("Page title is: " + driver.getTitle());
        Home h = new Home(driver);
        h.Fb();
        h.Insta();
        h.Email();
        h.booknow();
        h.learn();
        h.hawker();
    }
    

     /*   @DataProvider(name = "getData")
        public Object[][] getData() {
            return new Object[][] {
                { "rahul", "roy", "rahul@gmail.com", "Testing" },
                { "ram", "roy", "ram@gmail.com", "Testing" }
                // Add more data as needed
            };
		}  */
    
        /* @Test (dataProvider="getData")
        public void testOpenWebsite(String fname, String lname,String email, String msg) throws InterruptedException {
        	
        driver.get("https://www.villasandvines.co.nz/");
        //Title of page
        System.out.println("Page title is: " + driver.getTitle()); */
        
       /* WebElement contact = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[3]/div[2]/div[2]/div[2]/div/nav/div[6]/a"));
        contact.click();
        Thread.sleep(1000);
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"name-yui_3_17_2_1_1553888888520_3744-fname-field\"]"));
        firstname.sendKeys(fname);
        Thread.sleep(1000);
        WebElement lastname=driver.findElement(By.xpath("//*[@id=\"name-yui_3_17_2_1_1553888888520_3744-lname-field\"]"));
        lastname.sendKeys(lname);
        Thread.sleep(1000);
        WebElement emailid=driver.findElement(By.xpath("//*[@id=\"email-yui_3_17_2_1_1553888888520_3745-field\"]"));
        emailid.sendKeys(email);
        Thread.sleep(1000);
        WebElement message=driver.findElement(By.xpath("//*[@id=\"textarea-yui_3_17_2_1_1553888888520_3747-field\"]"));
        message.sendKeys(msg);
        Thread.sleep(1000);
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"block-69f3c81532361739e4a5\"]/div/div[2]/form/div[3]/button"));
        submit.click();
        Thread.sleep(1000); */
    }

     


