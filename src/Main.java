import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");

        double temperatura = sc.nextDouble();

        double temperaturaCelsius = fahrenheitToCelsius(temperatura);

        System.out.printf("Sua temperatura %.0f°F equivale a %.0f°C", temperatura, temperaturaCelsius);
    }
    public static double fahrenheitToCelsius(double temperature){
        double celsius = 5*((temperature-32)/9);
        return  celsius;
    };
}