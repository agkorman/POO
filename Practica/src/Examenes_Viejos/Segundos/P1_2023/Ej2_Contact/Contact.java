package Examenes_Viejos.Segundos.P1_2023.Ej2_Contact;

public class Contact implements Comparable<Contact> {

    private String name;
    private final String phoneNumber;


    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Contact other) {
        int ans = name.compareTo(other.getName());
        if (ans == 0) {
            ans = phoneNumber.compareTo(other.getPhoneNumber());
        }
        return ans;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }



    @Override
    public String toString() {
        return "| %s has %s as phone number |".formatted(name, phoneNumber);
    }


}
