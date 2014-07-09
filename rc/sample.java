import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;





public class sample {

	
	public static void main(String[] args) {
		Selenium selenium=new DefaultSelenium("localhost",1234,"firefox","http://webmath.com");
		selenium.start();
		selenium.open("/index.html");
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.click("//*[@id='navBox-2']/a");
		selenium.select("//*[@id='topicItem']", "Interest, Simple");
		selenium.type("//*[@id='d-childMainContLeft']/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center[1]/input","20000");
		selenium.type("//*[@id='d-childMainContLeft']/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center[2]/input","5");
		selenium.type("//*[@id='d-childMainContLeft']/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center[3]/input", "6");
		selenium.click("//*[@id='d-childMainContLeft']/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p[3]/input");
		/*selenium.click("css=#navBox-2 > a[title=\"General Math\"]");
		selenium.click("id=topicItem");
		selenium.select("id=topicItem", "label=Interest, Simple");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=principal");
		selenium.type("name=principal", "20000");
		selenium.type("name=interest", "10");
		selenium.type("name=desired_time", "6");
		selenium.click("//input[@value='Find the amount of interest']");
		selenium.waitForPageToLoad("30000");*/
		
	}

//	isElmentpresent
}
