import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o salario:");
        double salario = Double.valueOf(entrada.nextLine());
        double imposto;
        double inss;
        if (salario <1000){
            imposto = 0;
            inss = 0;
        } else if (salario >= 1000 && salario < 2000){
            imposto = (salario * 0.10);
            inss = (salario * 0.11);
        } else if (salario >= 2000 && salario <3000){
            imposto = (salario * 0.20);
            inss = (salario * 0.15);
        }else{
            imposto = (salario * 0.27);
            inss = (salario * 0.20);
        }
        System.out.println("Imposto =" +imposto);
        System.out.println("Inss = " +inss);

        entrada.close();
    }
}
