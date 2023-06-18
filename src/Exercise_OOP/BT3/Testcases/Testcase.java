package Exercise_OOP.BT3.Testcases;

import Exercise_OOP.BT3.Common.BaseTest;

public class Testcase extends BaseTest {

    public void login(){
        createDriver();
        System.out.println("Navigate to url ");
        System.out.println("Enter  password and email");
        System.out.println("submit button");
        System.out.println("verify redirect to admin");
        closeDriver();

    }

    public void addCategory(){
        createDriver();
        System.out.println("Navigate to url ");
        System.out.println("Enter  password and email");
        System.out.println("submit button");
        System.out.println("verify redirect to admin");
        System.out.println("Click on the product menu");
        System.out.println("Click on the category menu");
        System.out.println("Click on the add category button");
        closeDriver();
    }

    public static void main(String[] args) {
        Testcase testcase = new Testcase();
        testcase.login();
        testcase.addCategory();
    }
}
