package Exercise_OOP.BT3.Common;

public class BaseTest{
    public void createDriver(){
        System.out.println("Browser:"+ Constants.browser);
        System.out.println("Report:" + Constants.report);
        System.out.println("Headless" + Constants.headless);
    }

    public void closeDriver(){
        System.out.println("Close browser:" + Constants.browser);
    }

    public void closeDriver(String browser){
        System.out.println("Close browser:" + browser);
    }
}
