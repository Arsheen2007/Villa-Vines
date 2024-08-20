package Villa;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div[3]/div[2]/div[1]/div/a[1]")
	WebElement facebook;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[3]/div[2]/div[1]/div/a[2]")
	WebElement instagram;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[3]/div[2]/div[1]/div/a[3]")
	WebElement mail;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[3]/div[2]/div[3]/div[3]/a")
	WebElement book;
	
	public void Fb() throws InterruptedException
	{
		facebook.click();
		Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Facebook page title is: " + driver.getTitle());
        driver.close();  // This closes the current tab (Facebook)

        driver.switchTo().window(tabs.get(0));
	}
	
	public void Insta() throws InterruptedException
	{
		instagram.click();
		
		Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Instagram page title is: " + driver.getTitle());
        driver.close(); 
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
	}
	
	
	public void Email() throws InterruptedException
	{
		System.out.println("Hello1");
		mail.click();
		Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
 
        driver.close(); 
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
	}

	public void booknow() throws InterruptedException
	{ 
		System.out.println("Hello2");
		book.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
    @FindBy(xpath="/html/body/div[1]/main/article/section[3]/div[2]/div/div/div/div[3]/div/div/div/a")
    WebElement Savy;
    
    @FindBy(xpath="/html/body/div[1]/main/article/section[3]/div[2]/div/div/div/div[4]/div/div/div/a")
    WebElement Pinot;
    
    public void learn() throws InterruptedException
    {
    	Savy.click();
    	Thread.sleep(2000);
    	driver.navigate().back();
    	
    	Pinot.click();
    	Thread.sleep(2000);
    	driver.navigate().back();
    }
    
    @FindBy(xpath="/html/body/div[1]/main/article/section[4]/div[2]/div/div/div/div[6]/div/div/div/div/div/a/div")
    WebElement logo;
    public void hawker() throws InterruptedException
    {
    	logo.click();
    	Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Hawkers title is: " + driver.getTitle());
        driver.close(); 
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }
	
}
	


