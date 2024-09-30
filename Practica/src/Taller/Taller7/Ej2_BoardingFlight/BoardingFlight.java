package Taller.Taller7.Ej2_BoardingFlight;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class BoardingFlight {

    SortedSet<Passenger> passengers;

    public BoardingFlight(Comparator<Passenger> cmp) {
        passengers = new TreeSet<>(cmp);
    }

    public void addForBoarding(String name, int row, PassengerCategory cat) {
        passengers.add(new Passenger(name, row, cat));
    }

    public Iterator<Passenger> boardingCallIterator(){
        // return new Iterator<String>
        return passengers.iterator();
    }
}
