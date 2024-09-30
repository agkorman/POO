package Examenes_Viejos.Primeros.Repaso.Ej3_pizza;

public enum Toppings {

    EXTRA_QUESO("Extra Queso", 20),
    TOMATE("Tomate", 30),
    CEBOLLA("Cebolla", 10);

    private final String description;
    private final int precio;

    Toppings(String descpription,int precio) {
        this.description = descpription;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return description;
    }

    public int getPrice() {
        return precio;
    }

}
