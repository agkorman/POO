package Taller.Taller1.ej3;
import Taller.Taller1.ej2.Counter;
public class MultipleCounter extends Counter {

    private int times;

    public MultipleCounter(int times) {
        super(); // permite usar variables privadas de una clase padre
        this.times = times;
    }

    @Override // Se pone para sobreescribir un method
    public void incCount(){
        // es ineficiente pero es la única manera de hacerlo manteniendo privada la variable count de Counter
        for(int i = 1; i <= times; i++) {
            super.incCount();
        }
    }

    @Override
    public void decCount(){
        for(int i = 1; i <= times; i++) {
            super.decCount();
        }
    }
}
