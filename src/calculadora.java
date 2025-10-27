import java.util.Scanner;

public class calculadora {

    public static int sumar(int a, int b){
        int operacion = a + b;
        return operacion;
    }
    public static int resta(int a, int b){
       int operacion = a - b;
       return operacion;
    }
    public static int multiplicacion(int a, int b){
        int operacion = a * b;
        return operacion;
    }
    public static double division(int a, int b){
        double operacion = (double) a / b;
        return operacion;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce el primer operando: ");
        int numeroA = sc.nextInt();
        System.out.println("\nIntroduce el segundo operando: ");
        int numeroB = sc.nextInt();
        System.out.println("\nIntroduce qué operación quieres realizar: + / - / * / % ");
        String operacionarealizar = sc.next();
        if(operacionarealizar.equals("+")){
            System.out.println("\nHas escogido hacer una suma ");
            System.out.println("El resultado es: " + (numeroA + numeroB));
        }else if(operacionarealizar.equals("-")){
            System.out.println("Has escogido la resta ");
            System.out.println("El resultado es: " + (numeroA - numeroB));
        }else if(operacionarealizar.equals("*")){
            System.out.println("Has escogido la multiplicación ");
            System.out.println("El resultado es: " + (numeroA * numeroB));
        }else if(operacionarealizar.equals("%") && numeroB != 0){
            System.out.println("Has escogido la división");
            System.out.println("El resultado: " + (numeroA / numeroB));
        }

   }
}