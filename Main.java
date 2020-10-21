import  java.lang.Math;

public class Main {

    public static void main(String[] args) {
        sumarPrimosHasta(50);
        sumarPrimerosPrimos(50);
    }

    private static void sumarPrimerosPrimos(int numeros) {
        int i=2;
        int suma=0;
        int totalPrimos=0;

        do {
            if(esPrimo(i)) {
                suma = suma + i;
                totalPrimos++;
            }
            i++;
        } while (totalPrimos<numeros);
        System.out.println("La suma de los primeros " + numeros + " números primos es " +  suma);
    }


    private static void sumarPrimosHasta(int hasta) {
        int i;
        int suma=0;
        for(i=2;i<hasta;i++) {
            if (esPrimo(i)) {
                suma = suma + i;
            }
        }

        System.out.println("La suma de los números primos hasta " + hasta + " es " +  suma);
    }

    private static boolean esPrimo(int n) {
        int raiz;
        int i;
        raiz = (int) Math.sqrt(n);

        for(i=2;i<=raiz;i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
