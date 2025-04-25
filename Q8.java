import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        while (numero < 1 || numero > 3){
            System.out.printf("Digite 1 a 3:");
            numero = Integer.valueOf(entrada.nextLine());
        }

        System.err.println("Fim do Programa!");

        entrada.close();
    }    
}
