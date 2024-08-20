package Villa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class whoarewe {
	WebDriver driver;
	public whoarewe(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div[3]/div[2]/div[2]/div[2]/div/nav/div[2]/a")
	WebElement who;
	
	public void drop()
	{
		who.click();
		
	}

}
