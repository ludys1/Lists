package mobilePhone;

public class Contact {

    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    public static Contact creareContact (String name, int phoneNumber) {
        return new Contact(name, phoneNumber);
    }


}
