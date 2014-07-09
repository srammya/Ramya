import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class dynamiccaptcha {

	
	public static void main(String[] args) {
		Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://timesofindia.indiatimes.com");
		selenium.setSpeed("30000");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		String ntxt=selenium.getText("//*[@id='mathq2']");
		System.out.println(ntxt);
		String a=ntxt.substring(0,1);
		System.out.println(a);
		String b=ntxt.substring(4,5);
		System.out.println(b);
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		int t=a1+b1;
//		String total=""+t;
		String total=String.valueOf(t);
		selenium.type("//*[@id='mathuserans2']", total);
		System.out.print(total);
		selenium.close();
		selenium.stop();
		

	}

}
