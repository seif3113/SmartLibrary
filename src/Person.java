

public abstract class Person {

    protected String name;
    protected String phone_num;

    public Person(String name, String phone_num) {
        this.name = name;
        this.phone_num = phone_num;
    }

    public String getName() {
        return name;
    }

    public String getPhone_num() {
        return phone_num;
    }

}
