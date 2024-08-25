package Guias.Guia2.g2_e3;

public class Deletrear {
    public static void main(String[] args) {
        int argsNbr = args.length;
        if (argsNbr == 0) {
            System.out.println("Enter a message as an argument.");
            return;
        }
        for (int wordNbr = 0; wordNbr < argsNbr; wordNbr++) {
            int i = 0;
            for (; i < args[wordNbr].length() - 1; i++) {
                System.out.println(args[wordNbr].charAt(i) + "-");
            }
            // print the last character separately so not to print a dash at the end.
            System.out.println(args[wordNbr].charAt(i));
        }
        // done with for-each
        /*
        for (string arg : args) {
            int i = 0;
            for (; i < arg.length() - 1; i++) {
                System.out.println(arg.charAt(i) + "-");
            }
            System.out.println(arg.charAt(i));
        }
         */
    }
}
