import java.util.Scanner;

public class Conversor {

    // Método para converter Celsius para Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter Celsius para Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }


    // Método para converter Fahrenheit para Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Método para converter Kelvin para Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Método para converter Kelvin para Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha o tipo de conversão:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Celsius para Kelvin");
            System.out.println("3. Fahrenheit para Celsius");
            System.out.println("4. Fahrenheit para Kelvin");
            System.out.println("5. Kelvin para Celsius");
            System.out.println("6. Kelvin para Fahrenheit");
            System.out.print("Digite o número da opção desejada: ");
            int option = scanner.nextInt();
            
            double inputTemperature;
            double outputTemperature;
            
            switch (option) {
                case 1 -> {
                    System.out.print("Digite a temperatura em Celsius: ");
                    inputTemperature = scanner.nextDouble();
                    outputTemperature = celsiusToFahrenheit(inputTemperature);
                    System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit%n", inputTemperature, outputTemperature);
                }
                case 2 -> {
                    System.out.print("Digite a temperatura em Celsius: ");
                    inputTemperature = scanner.nextDouble();
                    outputTemperature = celsiusToKelvin(inputTemperature);
                    System.out.printf("%.2f Celsius é igual a %.2f Kelvin%n", inputTemperature, outputTemperature);
                }
                case 3 -> {
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    inputTemperature = scanner.nextDouble();
                    outputTemperature = fahrenheitToCelsius(inputTemperature);
                    System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius%n", inputTemperature, outputTemperature);
                }
                case 4 -> {
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    inputTemperature = scanner.nextDouble();
                    outputTemperature = fahrenheitToKelvin(inputTemperature);
                    System.out.printf("%.2f Fahrenheit é igual a %.2f Kelvin%n", inputTemperature, outputTemperature);
                }
                case 5 -> {
                    System.out.print("Digite a temperatura em Kelvin: ");
                    inputTemperature = scanner.nextDouble();
                    outputTemperature = kelvinToCelsius(inputTemperature);
                    System.out.printf("%.2f Kelvin é igual a %.2f Celsius%n", inputTemperature, outputTemperature);
                }
                case 6 -> {
                    System.out.print("Digite a temperatura em Kelvin: ");
                    inputTemperature = scanner.nextDouble();
                    outputTemperature = kelvinToFahrenheit(inputTemperature);
                    System.out.printf("%.2f Kelvin é igual a %.2f Fahrenheit%n", inputTemperature, outputTemperature);
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}