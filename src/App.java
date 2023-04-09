import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double Celsius = teclado.nextDouble();

        teclado.close();
        double Fahrenheit = 9 * Celsius / 5 + 32;

        System.out.printf("Temperatura em Fahrenheit:" + Fahrenheit);
