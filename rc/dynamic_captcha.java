import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class dynamic_captcha {

	public static void main(String[] args) throws InterruptedException {
		Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://timesofindia.indiatimes.com/");
		selenium.start();
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.open("/");
		Thread.sleep(30000);
		String nxt=selenium.getText("//*[@id='mathq2']");
		System.out.println(nxt);
		String a=nxt.substring(0,1);
		System.out.println(a);
		String o=nxt.substring(2,3);
		System.out.println(o);
		String b=nxt.substring(4,5);
		System.out.println(b);
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		int t=a1+b1;
		System.out.println(t);
		String total=String.valueOf(t);
		selenium.type("//*[@id='mathuserans2']", total);
		
		


	}

}
