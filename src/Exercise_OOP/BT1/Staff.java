package Exercise_OOP.BT1;

public class Staff {
    private String fullName;
    private int age;
    private String address;

    public Staff(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
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

    public void showInfortion(){
        System.out.println(this.address);
        System.out.println(this.fullName);
        System.out.println(this.age);
    }
}
