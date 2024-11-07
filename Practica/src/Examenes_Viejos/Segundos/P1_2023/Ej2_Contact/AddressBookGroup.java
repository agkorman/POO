package Examenes_Viejos.Segundos.P1_2023.Ej2_Contact;


import java.util.Objects;
import java.util.TreeSet;

public class AddressBookGroup {

    private final String name;

    public AddressBookGroup(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof AddressBookGroup that && this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}

