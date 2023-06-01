package Exercise_OOP.BT2.Company;

import Exercise_OOP.BT2.Person.Person;

public class Company extends Person {
    public Company(String fullName, int age, String gender) {
        super(fullName, age, gender);
    }

    public static void main(String[] args) {
        String fullName = "giangtt";
        int age = 25;
        String gender = "Nam";
        Company company = new Company(fullName, age, gender);
        company.showCompany();
    }
}
