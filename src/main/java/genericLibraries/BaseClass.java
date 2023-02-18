package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.CoreJavaForSeleniumPage;
import pompages.HomePage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;
import pompages.ContactUsPage;
import pompages.CoreJavaVedioPage;
import pompages.SeleniumTrainingPage;



public class BaseClass {
	
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage skillraryDemo;
	protected ContactUsPage contact;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage coreJava;
	protected SeleniumTrainingPage selenium;
	protected CoreJavaVedioPage javaVideo;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	       public void classConfiguration()
	       {
		     PropertiesFileUtility property= new PropertiesFileUtility();
		     ExcelUtility excel= new ExcelUtility();
		     @SuppressWarnings("unused")
			 WebDriverUtility web= new WebDriverUtility();
		
		     
		     property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		     excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		     
	       }

	@BeforeMethod
	public void methodConfiguration() {
		long time = Long.parseLong(property.fetchproperty("timeouts"));
		driver = web.openApplication(property.fetchproperty("browser"), property.fetchproperty("url"), time);
		home=new HomePage(driver);
		skillraryDemo = new SkillraryDemoAppPage(driver);
		selenium= new SeleniumTrainingPage(driver);
		coreJava=new CoreJavaForSeleniumPage(driver);
		javaVideo= new CoreJavaVedioPage(driver);
		testing=new TestingPage(driver);
		contact=new ContactUsPage(driver);
	}

	@AfterMethod
	    public void methodTearDown()
	    {
		   web.quitBrowser();
	    }
	@AfterClass
	     public void classTearDown()
	     {
		   excel.closeExcel();
	     }
       	
	// @AfterTest
	// @AfterSuite
}


	
	
	

}
