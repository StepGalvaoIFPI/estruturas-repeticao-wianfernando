import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o salario:");
        double salario = Double.valueOf(entrada.nextLine());
        double aumento = 0;
        if (salario >= 1250){
            aumento = (salario * 0.10);
        }else{
            aumento = (salario * 0.15);
        }
        double salario_final = (salario + aumento);

        System.out.println("Aumento =" +aumento);
        System.out.println("Salario =" + salario_final);
        entrada.close();
    }
}
