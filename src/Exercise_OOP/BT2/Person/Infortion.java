package Exercise_OOP.BT2.Person;

public class Infortion {
    public static void main(String[] args) {
        String fullName = "giangtt";
        int age = 25;
        String address = "HY";
        String gender = "Nam";
        String phone = "023456789";
        Person person = new Person(fullName, age, address, gender, phone);
        person.setAge(30);
        person.show();
    }
}
