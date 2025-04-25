import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;


        while (numero!= 1){
            System.out.printf("Digite o numero 1:");
            numero = Integer.valueOf(entrada.nextLine());
        }

        System.out.println("Você digite o numero 1!");

        entrada.close();
    }
}
