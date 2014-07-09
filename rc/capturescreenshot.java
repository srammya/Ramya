

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class capturescreenshot {

			public static void main(String[] args)  {
				
				Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","https://login.yahoo.com");
				selenium.start();
				selenium.open("/config/login_verify2?.intl=in&.src=ym");
				selenium.windowMaximize();
				selenium.windowFocus();
				selenium.type("id=username", "kp_rammya");
				selenium.type("id=passwd","Test");
				selenium.click("//*[@id='pLabelC']");
				selenium.click("//*[@id='.save']");
//				selenium.clickAt("//*[@id='pLabelC']","Signin");
//				selenium.check("//*[@id='pLabelC']");
		

//		Assert.assertEquals("Expected Message is Displayed", title, "Gmail: Email from Google");
//	selenium.captureEntirePageScreenshot("C:\\Users\\rkaliyaperumal\\Desktop\\err.jpg"," ");
if(selenium.isElementPresent("//*[@id='.sav']")){
			selenium.click("//*[@id='.save']");
}
else
{
				selenium.captureEntirePageScreenshot("C:\\Users\\rkaliyaperumal\\Desktop\\err1.jpg"," ");
				System.out.println("Hello");
//			
		}	
		

		}
		
	}
