package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This POM class consists of all business libraries related to skillrary hom page
 * @author priti
 *
 */

public class HomePage {
	//Declaration
	@FindBy(xpath="")
	private WebElement logo;
	@FindBy(xpath="")
	private WebElement gears;
	@FindBy(xpath="")
	private WebElement searchBar;
	@FindBy(xpath="")
	private WebElement searchButton;
	@FindBy(xpath="")
	private WebElement skillraryDemoApp;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	/**
	 * This method is used to get logo
	 * @return
	 */
	public WebElement getLogo() {
		return logo;
	}
	/**
	 * This method is used to search a course
	 * @param data
	 */
	public void searchFor(String data) {
		searchBar.sendKeys(data);
		searchButton.click();
	}
	/**
	 * This method is used to click gears tab
	 */
	public void clickGears() {
		gears.click();
	}
	/**
	 * This method is used to click skillrary demo app option
	 */
	

	
	
	
	
	
	

}
