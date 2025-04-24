import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o salario:");
        double salario = Double.valueOf(entrada.nextLine());
        double imposto;
        double inss;
        if (salario >=2000){
            imposto = (salario * 0.15);
            inss = (salario * 0.10);
        }else{
            imposto = 0;
            inss = 0;
        }
        System.out.println("Salario =" + salario);
        System.out.println("Imposto de Renda =" +imposto);
        System.out.println("Inss = " +inss);

        entrada.close();
    }
}
