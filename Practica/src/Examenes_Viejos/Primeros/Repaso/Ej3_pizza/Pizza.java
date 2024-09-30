package Examenes_Viejos.Primeros.Repaso.Ej3_pizza;

public class Pizza {

    private final PizzaType tipo;
    private final Toppings[] toppings;

    public Pizza(Toppings[] toppings, PizzaType tipo) {
        this.toppings = toppings;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("Pizza ");
        int precio = tipo.getPrecio();
        ans.append(tipo.toString());
        for (Toppings topping : toppings) {
            ans.append(" con ").append(topping.toString());
            precio += topping.getPrice();
        }
        ans.append(": ").append(precio);
        return ans.toString();
    }
}
