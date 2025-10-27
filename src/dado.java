import java.util.Random;
import java.util.Scanner;

public class dado {


    public static int dado(int min, int max) {
        Random gen = new Random();
        int resultado = gen.nextInt(min, max + 1);
        return resultado;
    }

    public static void main(String[] args) {
        int partidas = 10;
        int tiradas = 0;
        while (tiradas < partidas) {
            tiradas++;
            int resultiradactual = dado(1,6);
            System.out.println("Ha salido: " + resultiradactual);
        }
    }
}
