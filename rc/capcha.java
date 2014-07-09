import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class capcha {

	public static void main(String[] args)throws Exception {
		// 
		Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://timesofindia.indiatimes.com/");
		selenium.start();
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.open("/");

Thread.sleep(40000);
//		String ntxt=selenium.getText("//*[@id='mathq2']");
		String ntxt=selenium.getText("html/body/table/tbody/tr/td/div/table/tbody/tr/td/form/table/tbody/tr[3]/td/div/table/tbody/tr[2]/td[1]/span");
		System.out.println(ntxt);
		String a,b;
		a=ntxt.substring(0,1);
		
		b=ntxt.substring(4,5);
	//	System.out.println(a + "" + b);
	int a1=Integer.parseInt(a);
	int a2=Integer.parseInt(b);
	int total=a1+a2;
	String t=""+total;
	System.out.println(t);
	selenium.type("//*[@id='mathuserans2']",t);
	
	
	
	}

}
