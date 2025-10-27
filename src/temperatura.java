import java.util.Scanner;
public class temperatura {


    public static int celsiusAFarenheit(int farenheit, int temperatura) {
        int conversion = (farenheit = temperatura * 9 / 5) + 32;
        return conversion;
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int F;
        System.out.println("Ingrese la temperatura en grado celsius: ");
        int temperatura = lector.nextInt();
        System.out.println("\nLa temperatura es de: " + temperatura);
        int resultado = (F = (temperatura * 9 / 5) + 32);
        System.out.println("\nSu temperatura convertida a farenheit es: " + resultado + "F");
    }
}

