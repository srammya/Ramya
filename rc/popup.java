import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://www.hdfcbank.com");
		selenium.setSpeed("2000");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		System.out.println();
		selenium.click("//*[@id='loginsubmit']");
		
		String wn[]=selenium.getAllWindowNames();
		System.out.println("---------------After Opening-------------");
		for (int i=0;i<wn.length;i++) {
			System.out.println(wn[i]);
			
		}
		selenium.waitForPopUp(wn[1],"30000");
		selenium.selectWindow(wn[1]);
		selenium.click("//*[@id='wrapper']/div[6]/a/img");
		
		selenium.close();//current window
		selenium.stop(); //kill the selenium 
	}
}