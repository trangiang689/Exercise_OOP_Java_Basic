package Exercise_OOP.BT2.Person;

public class Person {
    private String fullName = "test";
    private int age = 20;
    private String address = "HN";
    private String gender = "Nu";
    private String phone = "123456789";

    public Person(String fullName, int age, String address, String gender, String phone) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void show(){
        System.out.println(this.fullName);
        System.out.println(this.address);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.phone);
    }

    public void showCompany(){
        System.out.println(this.fullName);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
