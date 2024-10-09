package Guias.Guia6.Ej9_TimeSet;

public class Pair implements Comparable<Pair>{
    private int hour, min;

    Pair(int hour, int minute) {
        this.hour = hour;
        this.min = min;
    }
    @Override
    public String toString() {
        return "%s:%s".formatted(hour, min);
    }

    @Override
    public int compareTo(Pair o) {
        int ans = this.hour - o.hour;
        if (ans == 0) {
            ans = this.min - o.min;
        }
        return ans;
    }
    protected int getHour() {
        return hour;
    }
    protected int getMin() {
        return min;
    }

    protected boolean isAfter(int h, int m) {
        if (this.hour < h) {
            return false;
        }
        if (this.min < m) {
            return false;
        }
        return true;
    }

    protected boolean ifBefore(int h, int m) {
        if (this.hour > h) {
            return false;
        }
        if (this.min > m) {
            return false;
        }
        return true;
    }
}
