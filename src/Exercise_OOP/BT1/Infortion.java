package Exercise_OOP.BT1;

public class Infortion {
    public static void main(String[] args) {
        String fullName = "giangtt";
        int age = 25;
        String address = "HY";
        Staff staff = new Staff(fullName, age, address);
        staff.showInfortion();
    }
}
