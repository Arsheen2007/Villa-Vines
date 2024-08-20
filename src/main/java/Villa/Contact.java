package Villa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	
	WebDriver driver;
	
	public Contact(WebDriver driver1)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div[3]/div[2]/div[2]/div[2]/div/nav/div[6]/a")
	WebElement con;
	
	@FindBy(xpath="[@id=\\\"name-yui_3_17_2_1_1553888888520_3744-fname-field\\\"]")
	WebElement fname;
	
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement login; 
 
	public void contactdeatils()
	{
		con.click();
	}
	
	public void Home()
	{
		driver.get("https://www.villasandvines.co.nz/");
		driver.manage().window().maximize();
	}
	
	
}