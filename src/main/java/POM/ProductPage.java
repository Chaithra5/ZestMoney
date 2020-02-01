package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	String priceValue ;
	String fpriceValue ;
	int aprice;
	int flprice;
	@FindBy(xpath="//span[@class='a-price-whole']")
	private WebElement price;
	
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']")
	private WebElement fprice;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getPrice()
	{
		 priceValue = price.getText();
		System.out.println(priceValue);
	 aprice=Integer.parseInt(priceValue);
	}
	public void fgetPrice()
	{
		fpriceValue = fprice.getText();
		System.out.println(fpriceValue);
		String[] word = fpriceValue.split("?")	;
		System.out.println(word[1]);
		 flprice=Integer.parseInt(word[1]);
	}
	public void comparePrice()
	{
		if(aprice==flprice)
		{
			System.out.println("Both price equal");
		}else
		{
			System.out.println("Both price NOT equal");
		}
	}
	
}
