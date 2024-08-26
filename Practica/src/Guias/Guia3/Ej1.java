package Guias.Guia3;

public class Ej1 {
    public static void main(String[] args) {
        String s1, s2;
        /*
        Cambiando la generación de s1 y s2
          s1 = "hola"
          s2 = "hola"
        */
        s1 = new String("hola");
        s2 = new String("hola");
        if (s1.equals(s2) /* changing the comparing method */) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }

}

