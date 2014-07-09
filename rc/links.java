import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class links {
	
	public static void main(String[] args) {
		Selenium selenium=new DefaultSelenium("localhost",1234,"firefox","http://webmath.com/");
		selenium.start();
		selenium.open("/index.html");
		selenium.windowMaximize();
		selenium.windowFocus();
		String link[]=selenium.getAllLinks();
		for(int i=0;i<link.length;i++){
			
					System.out.println(link[i]);
			
		}
		
		System.out.println(link.length);

	}

}
