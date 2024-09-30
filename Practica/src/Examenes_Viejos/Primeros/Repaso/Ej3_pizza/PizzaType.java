package Examenes_Viejos.Primeros.Repaso.Ej3_pizza;

public enum PizzaType {

    HORNO("al horno", 100),
    PARRILA("a la parrilla", 150);

    private final String descripcion;
    private final int precio;

    PizzaType(String descripcion, int precio) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
}
