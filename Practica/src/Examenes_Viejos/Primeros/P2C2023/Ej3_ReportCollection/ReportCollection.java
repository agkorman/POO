package Examenes_Viejos.Primeros.P2C2023.Ej3_ReportCollection;


// puede modificarse
public interface ReportCollection<R> {


    void add(R report);


    R get(int index);


    R[] reports();


}

