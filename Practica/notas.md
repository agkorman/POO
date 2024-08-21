### Array

Se pueden crear de la misma forma que en c </br>
o en el estilo de java.
```
int[] v1 = new int[10]; // Java-Style
```

#### Imprimir arreglos en salida estandar
````
int[] v1 = new int[10];
Integer[] v1 = new Integer[10];
v1[2] = 10;

System.out.println(V1[3]); -> 0
System.out.println(v2 [3]) ; -> null
System.out.println(v3 [1O]); -> Error !E v[10]
System.out.println(v2[1]) + 5); -> Error
System.out.println(v1.lenght); -> 10
System.out.println(v1.toString()); -> [I@2626b418
System.out.println(Arrays.toString(v1)); -> [0, 0, 10, 0, 0, 0, 0, 0, 0, 0]

```` 

### Loops
Son iguales que en c salvo por for-each.
#### for-each
````
double avg = 0;
for (int i : v1) {
    avg += 1;
}
avg /= avg.length;
````
### Argumentos Variables
````
// Sumar 0 o más argumentos
static int sum(int... values) {
    int res = 0;
    for (int n : values) {
        res += n;
    }
    return res;
}
````
La notacion (int... values) recibe una serie de parámetros </br>
y la convierte en un array.