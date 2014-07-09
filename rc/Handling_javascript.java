
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Handling_javascript {

    public static void main(String args[])throws Exception{
//        SeleniumServer server= new SeleniumServer();
//    server.stop();
//    server.start();
    Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://rediff.com/"); 
    selenium.start();
    selenium.open("/");
    selenium.windowMaximize();
    selenium.click("//*[@id='signin_info']/a[1]");
    
    selenium.click("//*[@id='btn_login']");
    
    if (selenium.isAlertPresent()){
        System.out.println("javascript displayed");
        String alert=selenium.getAlert();
        System.out.println(alert);
//        System.out.println(selenium.getAlert());
        
        selenium.chooseOkOnNextConfirmation();
//        selenium.captureEntirePageScreenshot("C://Users//Guest//err.jpg"," ");
        }
        


////    
//    System.out.println(selenium.getTitle());
////    System.out.println(selenium.getHtmlSource());
    
//    
//    
//    server.stop();

}

}
