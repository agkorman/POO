package Guias.Guia6.Ej5_funciones;
import java.util.ArrayList;
import java.util.List;

import Guias.Guia4.Ej2_Function.*;

public class CompositeFunction implements Function{

    private List<Function> funciones;

    public CompositeFunction() {
        funciones = new ArrayList<Function>();
    }

    public void addFunction(Function f) {
        funciones.add(f);
    }

    @Override
    public double evaluate(double x) {
        double answer = x;
        if (funciones.isEmpty()) {
            throw new IllegalStateException();
        }
        for (Function f : funciones) {
            answer = f.evaluate(answer);
        }
        return answer;
    }

}
