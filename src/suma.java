import java.util.Scanner;

public class suma {

    public static int suma(int operando, int operando2){
        int resultado = operando + operando2;
        return resultado;
    }

    public static void main(String [] args) {
        Scanner lector = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Introduce el primer número a sumar: ");
        numero1 = lector.nextInt();
        System.out.println("Introduce el segundo número a sumar: ");
        numero2 = lector.nextInt();

        int resultadoDeMiSuma = suma(numero1, numero2);

        String resultadoAImprimir = "La suma de " + numero1 + " es " + numero2 + " es = " + resultadoDeMiSuma;

        System.out.println(resultadoAImprimir);
    }
}
