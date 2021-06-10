import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int Num;

        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Num = sr.nextInt();
        int contador = Num;
        for (int i = 1; i < Num - 1; i++) {
            System.out.println(contador - 1);
            contador--;

        }
    }

}
