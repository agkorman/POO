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

### TextBlocks
````
String html =   """
                <html>
                    <body>
                        <p>Hello, Worls<\p>
                    </body>
                </html>
                """;
````
Toma en cuenta los espacios en blanco a la izquierda, útil </br>
para hacer strings con formate html, por ejemplo.

### Excepciones
Presentación 2, diapos 38-40

si una excepción extiende a:</br>
Exceptions ==> Checked Exception</br>
RuntimeException ==> Unchecked Exception
````
// catch
public Date(int day...) throws DataAccessException {
    throws DateException {
        if (day < 0) {
             throw new DateException();
        }
        this.day = day;
        this.month = month;
        this.year = year;
}

public class DateException extends Exceptions {
    public DateExceptions() {
        super("Mal los parámetros de fecha");
    }
}
````
Si el try {} abarca todos los llamados a un método, la excepsión es checked. Pero en</br>
el caso de que no lo haga, es una unchecked exception.


