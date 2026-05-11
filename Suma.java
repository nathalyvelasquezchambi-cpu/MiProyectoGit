import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num1, num2, suma;

        System.out.println("Ingrese el primer número:");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = entrada.nextInt();

        suma = num1 + num2;

        System.out.println("La suma es: " + suma);
    }
}