package Examenes_Viejos.Segundos.P2_2023.Ej1_CostByMiles;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class RouteCentral {

    Map<FromTo, Integer> routes = new HashMap<>();
    private final Function<Integer, Integer> func;

    public RouteCentral(Function<Integer, Integer> f) {
        this.func = f;
    }

    public void addOneWayRoute(String from, String to, int miles) {
       FromTo ft = new FromTo(from, to);
       routes.putIfAbsent(ft, miles);
    }

    public int getDirectRouteMiles(String from, String to) {
        FromTo ft = new FromTo(from, to);
        int ans = routes.getOrDefault(ft, 0);
        if (ans == 0) {
            throw new RuntimeException("Route does not exist");
        }
        return ans;
    }

    public void changeRouteCost(String from, String to, int newMilage) {
        FromTo ft = new FromTo(from, to);
        int ans = routes.getOrDefault(ft, 0);
        if (ans == 0) {
            throw new RuntimeException("Route does not exist");
        }
        routes.put(ft, newMilage);
    }

    public void addTwoWayRoute(String from, String to, int miles) {
        FromTo ft = new FromTo(from, to);
        FromTo tf = new FromTo(to, from);
        routes.putIfAbsent(ft, func.apply(miles));
        routes.putIfAbsent(tf, func.apply(miles));
    }

    public int getOneStopRouteMiles(String from, String dest1, String dest2) {
        int ans = this.getDirectRouteMiles(from, dest1);
        ans += this.getDirectRouteMiles(dest1, dest2);
        return ans;
    }
    // debería mejorar la repeticón del código en las funciones pero bueno
}
