package Examenes_Viejos.Segundos.P1_2023.Ej2_Contact;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class AddressBook extends HashMap<AddressBookGroup, TreeSet<Contact>> {

    public AddressBook() {}

    public void addContact(AddressBookGroup abg, String name, String phone) {
        this.putIfAbsent(abg, new TreeSet<>());
        this.get(abg).add(new Contact(name, phone));
    }

   public Contact getContact(AddressBookGroup abg, String name) {
        if (!this.containsKey(abg)) throw new IllegalArgumentException();
        Contact ans = null;
        for (Contact contact : this.get(abg)) {
           if (name.equals(contact.getName())) {
               ans = contact;
           }
        }
        if (ans == null){
            throw new IllegalArgumentException();
        }
        return ans;
   }

   public SortedSet<Contact> getAllContacts(AddressBookGroup abg) {
        return this.getOrDefault(abg, new TreeSet<>());
   }

   public SortedSet<Contact> getAllContacts() {
        SortedSet<Contact> ans = new TreeSet<>();
        for (AddressBookGroup abg : this.keySet()) {
            ans.addAll(this.getAllContacts(abg));
        }
        return ans;
   }

   public void renameContact(AddressBookGroup abg, String name, String newName) {
        Contact aux = this.getContact(abg, name);
        this.get(abg).remove(aux);
        this.get(abg).add(new Contact(newName, aux.getPhoneNumber()));
   }
}
