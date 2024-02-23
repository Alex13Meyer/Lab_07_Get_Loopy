import java.util.Scanner;

public class C_to_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean isValidInput;

        do {
            System.out.println("What is the temperature in celsius? ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                isValidInput = true;
            } else {
                System.out.println("Bad input. Enter valid temperature: ");
                isValidInput = false;
                in.next();
            }
        }while (!isValidInput) ;
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit ");
        }
        public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5 ) + 32;
        }

    }



