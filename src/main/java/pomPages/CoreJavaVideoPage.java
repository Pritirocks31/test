package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {

	//Declaration
	@FindBy(xpath="//h1")
	private WebElement pageHeader;
	
	@FindBy(xpath="")
	private WebElement playButton;
	
	@FindBy(xpath="")
	private WebElement pauseButton;
	
	@FindBy(xpath="")
	private WebElement addToWishlistTab;
	
	//Initialization
	public CoreJavaVideoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void clickPlayButton() {
		playButton.click();
	}
	
	public void clickPauseButton() {
		pauseButton.click();
	}
	public void clickAddToWishlist() {
		addToWishlist.tab();
	}
		
	}
	
	
	
	

