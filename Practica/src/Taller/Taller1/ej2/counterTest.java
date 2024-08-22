package Taller.Taller1.ej2;

import Taller.Taller1.ej3.MultipleCounter;

public class counterTest {
    public static void main(String[] args) {
        Counter counter = new MultipleCounter(3); // el constructor solo se usa con new para crear nuevo obejeto
        System.out.println("Testing Class Counter");
        System.out.println(counter.getCount());
        counter.incCount();
        System.out.println(counter.getCount());
        counter.decCount();
        System.out.println(counter.getCount());
        counter = new Counter(); // Forma de resetear el contador es crear un nuevo objeto con el mismo nombre
                        // esto pisa la zona de memoria donde estaba el objeto anterior, resetéandolo
    }
}