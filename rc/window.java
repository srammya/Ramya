import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class window {

	public static void main(String[] args) {
		Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://www.icicibank.com/");
		selenium.start();
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.open("/");
//		selenium.click("//*[@id='footer_container']/p/a[1]");
		String wn[]=selenium.getAllWindowNames();
		System.out.println("---------------Before Opening-------------");
		for (int i=0;i<wn.length;i++) {
			System.out.println(wn[i]);
			
		}
		
		
	/*selenium.click("//*[@id='bottom_links_container']/div[3]/p/a[1]");
		
		wn[]=selenium.getAllWindowNames();
		for (int i=0;i<wn.length;i++) {
			System.out.println(wn[i]);}
		selenium.waitForPopUp(wn[1],"20000");
//
selenium.selectWindow(wn[1]);
selenium.click("//*[@id='cssmenu1']/li[1]/a");

//		selenium.close();//current window
//		selenium.stop();//kill the selenium
*/	}

	}
