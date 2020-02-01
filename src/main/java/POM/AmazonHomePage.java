package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	@FindBy(id="twotabsearchtextbox")
	private WebElement seachBox;
@FindBy(xpath="//input[@type='submit']")
private WebElement clicksearch;
@FindBy (xpath="//input[@title='Search for products, brands and more']")
private WebElement fsearchbox;
@FindBy(xpath="//button[@type='submit']")
private WebElement fclicksearch;
	
	
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct(String data)
	{
		seachBox.sendKeys(data);
		
	}
	public void onClick()
	{
		clicksearch.click();
	}
	public void fsearchproduct(String data)
	{
		fsearchbox.sendKeys(data);
	}
	public void fonClick()
	{
		fclicksearch.click();
	}
}
