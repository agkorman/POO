package Examenes_Viejos.Primeros.Repaso.Ej1_Examenes;

import java.util.Arrays;

public class LimitedExam extends UniqueExam {

    private int waitingStudents;
    private int quota;
    private int Initial_Dim = 5;
    private String[] waitingList = new String[Initial_Dim];

    public LimitedExam(String name, int quota) {
        super(name);
        this.quota = quota;
        waitingStudents = 0;
    }

    public void enrollOnWaitingList(String student) {
        if (waitingStudents == waitingList.length) {
            waitingList = Arrays.copyOf(waitingList, waitingList.length + Initial_Dim);
        }
        waitingList[waitingStudents++] = student;
    }

    @Override
    public void enroll(String student) {
        int enrolled = getEnrolledCount();
        if (enrolled < quota) {
            super.enroll(student);
        }
        else {
            if (waitingStudents == waitingList.length) {
                enrollOnWaitingList(student);
            }
        }
    }

    public String[] getWaitingList() {
        return Arrays.copyOf(waitingList, waitingStudents);
    }

    @Override
    public void unenroll(String student) {
        if(removeFromWaitingList(student)) { // Contempla unenroll de alumnos en espera
            return;
        }
        int dimBeforeUnenroll = getEnrolledCount();
        super.unenroll(student);
        if(isSomeoneWaiting() && getEnrolledCount() < dimBeforeUnenroll) {
            String pendingToEnroll = waitingList[0];
            enroll(pendingToEnroll);
            removeFromWaitingList(pendingToEnroll);
        }
    }


    private boolean isSomeoneWaiting() {
        return waitingStudents != 0;
    }

    // yo lo había planteado con un ciclo, moviendo a todos un lugar en el array
    private boolean removeFromWaitingList(String student) {
        for (int i = 0; i < waitingStudents; i++) {
            if (waitingList[i].equals(student)) {
                System.arraycopy(waitingList, i + 1, waitingList, i, waitingStudents - 1 - i);
                waitingStudents--;
                return true;
            }
        }
        return false;
    }

    private void resize() {
        waitingList = Arrays.copyOf(waitingList, waitingList.length + Initial_Dim);
    }

}
