package Taller.Taller7.Ej2_BoardingFlight;

public class Passenger {

    private final String name;
    private final PassengerCategory cat;
    private final int row;

    public Passenger(String name, int row, PassengerCategory cat){
        this.name = name;
        this.cat = cat;
        this.row = row;
    }

    public PassengerCategory getCategory(){
        return cat;
    }

    public int getRow(){
        return row;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
