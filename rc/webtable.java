import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class webtable {
    public static void main(String args[])
    {
        int total=0;
        Selenium selenium=new DefaultSelenium("localhost",4444,"firefox","http://scores.sify.com");
        selenium.start();
        selenium.open("/match/scorecard/NZ_WI_DEC19_DEC23_2013.shtml");
        selenium.windowMaximize();
        selenium.windowFocus();
        selenium.waitForPageToLoad("30000");
        //find the row count
    int x=2;//row count is starting from 2
    int rnum=0;  //html/body/div[1]/div[3]/table/tbody/tr[2]/td[2]
    String rsta="xpath=html/body/div[1]/div[3]/table/tbody/tr[";
    String rend="]/td[2]";
    while(selenium.isElementPresent(rsta+x+rend))  //find till the last row
    {
        x++;
        rnum++;
    }
    System.out.println("row count is" + rnum);
    
   int y=1; //column count starts from 1
    int cnum=1;
    String csta ="xpath=html/body/div[1]/div[3]/table/tbody/tr[2]/td["; 
            String cend ="]";
            
    while(selenium.isElementPresent(csta+y+cend))
    {
        
        y++;
        cnum++;
    }
    System.out.println("column count is" + cnum);
    
    System.out.println("..............................");
    String xstart="xpath=html/body/div[1]/div[3]/table/tbody/tr[";
    String xmid="]/td[";
    String xend="]";
    
    for(int rows=2;rows<rnum;rows++)
    {
        for(int cols=1;cols<cnum;cols++)
        {
//        System.out.print(selenium.getText(xstart+rows+xmid+cols+xend));
            System.out.print(selenium.getTable("xpath=html/body/div[1]/div[3]/table[1]."+(rows-1)+"."+(cols-1)));
    }
        System.out.println("---------------");
    }
      /*  int colss=4;
        for(int rowss=2;rowss<rnum;rowss++)
        {
            
            String a=selenium.getText(xstart+rowss+xmid+colss+xend);
            int b=Integer.parseInt(a);
            total=total+b;
            }
        System.out.println(".................................");
        System.out.println("total is" + total);*/
        
            }

}
