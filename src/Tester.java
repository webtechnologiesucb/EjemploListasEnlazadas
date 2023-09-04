import java.util.Scanner;

public class Tester {

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner oScanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de primos que desee agregar: ");
        int n = oScanner.nextInt();  // Cambiar n segun sea necesario
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        int num = 2;
        while (n > 0) {
            if (esPrimo(num)) {
                lista.insertarDerecha(num);
                n--;
            }
            num++;
        }
        System.out.println(lista.toString());
        System.out.println("Total items: " + lista.size());
        lista.eliminarDerecha(11);
        lista.eliminarIzquierda(2);
        System.out.println(lista.toString());
        System.out.println("Total items: " + lista.size());
    }
}

