package Examenes_Viejos.Primeros.P2C2023.Ej2_LoungeCentral;

// No se puede modificar
public class LoungeCentral {
    private boolean isOpen = true;


    public void openLounges() {
        isOpen = true;
    }


    public void closeLounges() {
        isOpen = false;
    }


    public boolean isOpen() {
        return isOpen;
    }
}

