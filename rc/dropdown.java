import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class dropdown {

	
	public static void main(String[] args) {
		Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://www.geodatasource.com/");
		selenium.start();
		selenium.open("/world-major-cities.html");
		selenium.windowFocus();
		selenium.windowMaximize();
		selenium.select("id=countryCode", "India");
		String value[]=selenium.getSelectOptions("id=countryCode");
		for (int i=0;i<value.length;i++){
			System.out.println(value[i]);
		}
		
		
		System.out.println(value.length);
	}

}
