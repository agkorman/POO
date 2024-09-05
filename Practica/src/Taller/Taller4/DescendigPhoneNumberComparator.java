package Taller.Taller4;

import java.util.Comparator;


public class DescendigPhoneNumberComparator implements Comparator<PhoneNumber> {

    @Override
    public int compare(PhoneNumber o1, PhoneNumber o2) {
        return o2.compareTo(o1);
    }
}
