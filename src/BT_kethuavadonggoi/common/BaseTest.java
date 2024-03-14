package BT_kethuavadonggoi.common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver(){
        System.out.println("Close Browser: " + Constants.browser);
    }

    public void closeDriver1(String browser){
        System.out.println("Close Browser: " + browser);
    }

}
