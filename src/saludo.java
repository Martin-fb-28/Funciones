import java.util.Scanner;

public class saludo {


    public static void saludar(String nombreEntrada){
        System.out.println(" Bienvenido " + nombreEntrada);
    }


    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = lector.nextLine();

        saludar(nombre);
    }








}

