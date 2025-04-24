import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = Integer.valueOf(entrada.nextLine());

        if (numero >= 1){
            for (int i = 1; i <= numero; i++){
                System.out.println(i);
            }
        }else{
            System.out.println("Numero Invalido");
        }
        entrada.close();
    }
}
