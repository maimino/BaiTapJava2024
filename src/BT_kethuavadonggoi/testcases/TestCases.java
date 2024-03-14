package BT_kethuavadonggoi.testcases;

import BT_kethuavadonggoi.common.BaseTest;

public class TestCases extends BaseTest {

    public void loginCMS(){
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verify and redirect to Admin page");
        closeDriver();
    }

    public void addCategoryCMS(){
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verify and redirect to Admin page");

        System.out.println("Click on the Product menu");
        System.out.println("Click on the Category menu");
        System.out.println("Click on the Add New Category button");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Click on the Save button");
        System.out.println("Verify add New Category successfully");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.loginCMS();
        System.out.println("====================");
        testCases.addCategoryCMS();
    }

}
