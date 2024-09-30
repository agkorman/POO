package Examenes_Viejos.Primeros.Repaso.Ej3_pizza;

public class PizzaTester {

    public static void main(String[] args) {
        // Pizza a la parrilla con Tomate
        Pizza pizza1 = new Pizza(new Toppings[] {Toppings.TOMATE}, PizzaType.PARRILA);
        // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Pizza pizza2 = new Pizza(new Toppings[] {Toppings.TOMATE, Toppings.CEBOLLA, Toppings.EXTRA_QUESO}, PizzaType.PARRILA);
        // Pizza al horno con Cebolla con Extra queso
        Pizza pizza3 = new Pizza(new Toppings[] {Toppings.CEBOLLA, Toppings.EXTRA_QUESO}, PizzaType.HORNO);
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }

}

