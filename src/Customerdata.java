

import java.util.ArrayList;

public class Customerdata extends Person {

    protected String email;
    private String gender;
    private static int num = 0; // the number of customers
    public static ArrayList<Customerdata> customersdata = new ArrayList<>();

    public Customerdata(String name, String phone_num, String email, String gender) {
        super(name, phone_num);
        this.email = email;
        this.gender = gender;
        customersdata.add(this);
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public static void Add(String name, String phone_num, String email, String gender) {
        customersdata.add(new Customerdata(name, phone_num, email, gender));
        num++;
    }

    public static void Remove(String customerName) {
        for (int i = 0; i < customersdata.size(); i++) {
            if (customersdata.get(i).getName().equals(customerName)) {
                customersdata.remove(i);
                num--;
                break;
            }
        }
    }

}
