package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {
	
	@Test
	public void thirdTest() {
		SoftAssert soft=new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(corejava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		
		corejava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.getPageHeader(),"Core Java For Selenium Training");
		
		javaVideo.clickCloseCookies();
		web.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(2000);
		javaVideo.clickPauseButton();
		
		web.switchBackFromFrame();
		javaVideo.clickAddToWishlist();
		soft.assertAll();
		
		
	}
	
	
}
