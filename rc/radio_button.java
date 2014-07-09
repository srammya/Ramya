import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class radio_button {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://www.quackit.com");
		selenium.start();
		selenium.open("/html/codes/html_radio_button.cfm");
		selenium.windowFocus();
		selenium.windowMaximize();
		selenium.check("name=preferred_color");
		System.out.println(selenium.getValue("name=preferred_color"));
		Thread.sleep(2000);
		selenium.check("//*[@id='content']/table[1]/tbody/tr[2]/td[2]/form/input[2]");
		
		
		System.out.println(selenium.getValue("name=preferred_color"));
		

		selenium.close();
		selenium.stop();

	}

}
