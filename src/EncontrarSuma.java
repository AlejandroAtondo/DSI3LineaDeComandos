import java.util.Arrays;

public class EncontrarSuma {
    //Atondo Ojeda Darío Alejandro
    public static boolean encontrar(int[] arreglo, int objetivo) {
        Arrays.sort(arreglo);
        //se ordena el arreglo

        int izq = 0;
        int der = arreglo.length - 1;

        while(izq < der) { // en este bucle while, se buscan las posibles combinaciones de sumas para obtener el valor de objetivo
                            // siempre y caundo el valor izquierdo sea menor que el derecho
            int suma = arreglo[izq] + arreglo[der]; // la suma en cuestión con los elementos en el arreglo
            if (suma == objetivo) { //si la suma es igual al objetivo, es verdadero y se termina el bucle
                return true;
            } else if (suma < objetivo) { //si la suma es menor al objetivo, el valor izquierdo se descarta y se pasa al
                                        // siguiente valor en el arreglo
                izq++;
            } else {  //por otro lado, si la suma es mayor al objetivo, se descarta el valor derecho y se pasa al anterior
                der--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                if (args.length < 2) {
                    System.out.println("El argumento debe contener almenos 2 elementos");
                }
                int objetivo = Integer.parseInt(args[0]);
                int[] arreglo = new int[args.length - 1]; //creación del segundo arreglo para separar el primer valor (objetivo) del resto

                for (int i = 0; i < arreglo.length; i++) {
                    arreglo[i] = Integer.parseInt(args[i + 1]); //se extrae el valor de los números del arreglo
                }

                if (encontrar(arreglo, objetivo)) { //se aprovecha la función de arriba y si es true, se ejecuta lo siguiente
                    System.out.println("Sí existen 2 números en el arreglo que sumen " + objetivo);
                }else { //si es false, se ejeccuta lo siguiente
                    System.out.println("No existen 2 números en el arreglo que sumen " + objetivo);
                }
            } catch (NumberFormatException e) {
                System.err.println("El argumento " + args[0] +
                        " debe ser un entero.");
                System.exit(1);
            }
        }
    }
}
