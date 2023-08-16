public class SumaPrefija {
    //Atondo Ojeda Darío Alejandro
    public static void main(String[] args) {
        int primerArg;
        int sumas = 0;
        if (args.length > 0) {
            try {
                for (int i = 0; i < args.length; i++) {
                    primerArg = Integer.parseInt(args[i]);
                    sumas += primerArg;
                    System.out.println("Posición " + i + ": "
                            + primerArg + "\tSuma = " + sumas);
                }

            } catch (NumberFormatException e) {
                System.err.println("El argumento " + args[0] +
                        " debe ser un entero.");
                System.exit(1);
            }
        }

    }
}
