package Examenes_Viejos.Segundos.P2024.Ej2_ReimbursementTracker;

import java.time.YearMonth;
import java.util.*;

public class ReimbursementTracker {

    private Map<String, SortedMap<YearMonth, Integer>> reimbursements;
    private Map<String, Integer> clients;

    public ReimbursementTracker() {
        reimbursements = new HashMap<>();
        clients = new HashMap<>();
    }

    public void registerClient(String name, int maxReimbursement) {
        if (reimbursements.get(name) != null) throw new IllegalArgumentException("Client already registered");
        reimbursements.putIfAbsent(name, new TreeMap<>());
        clients.putIfAbsent(name, maxReimbursement);
    }

    public void addReimbursement(String name, YearMonth date, int amount) {
        registeredClient(name);
        int maxReim = clients.get(name);
        reimbursements.get(name).putIfAbsent(date, maxReim); // si no tuvo un reintegro ese mes, agrego uno
        int current = reimbursements.get(name).get(date);
        if (current - amount < 0) { // chequeo que no pase el reintegro al máximo permitido para el cliente
            throw new RuntimeException("Reimbursement surpasses month cap.");
        }
        reimbursements.get(name).put(date, current - amount); // actualizo el valor de reintegro del cliente
    }

    public int getRemainingReimbursement(String name, YearMonth date){
        registeredClient(name);
        if (reimbursements.get(name).get(date) == null) {
            return clients.get(name); // si no tiene un reembolso en la fecha, retorno el máximo (predeterminado)
        }
        return reimbursements.get(name).get(date);
    }

    private void registeredClient(String name) {
        if (reimbursements.get(name) == null) throw new IllegalArgumentException("No such client registered");
    }

    public List<YearMonth> getReimbursements(String name, YearMonth from, YearMonth to) {
        registeredClient(name);
        List<YearMonth> ans = new ArrayList<>();
        for (YearMonth date : reimbursements.get(name).keySet()) {
            if(date.compareTo(from) >= 0  && date.isBefore(to)) {
                ans.add(date);
            }
        }
        return ans; // retorno una lista de los meses donde tuvo reintegros
    }

    // métodoo no pedido para que funciones el tester
    public int getReimbursement(String name, YearMonth date) {
        registeredClient(name);
        return clients.get(name) - reimbursements.get(name).get(date); // retorna la el reintegro hecho al cliente en la fecha dada
    }


}
