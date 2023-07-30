package aulaDeJava;
import java.util.Scanner;
public class Exercicio5 {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o primeiro número: ");
        int x = ENTRADA.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = ENTRADA.nextInt();
        System.out.print("Digite o terceiro número: ");
        int z = ENTRADA.nextInt();

        if (x<y && x<z){
            System.out.print("O menor número é: " + x + "; ");
            if(y<z){
                System.out.print("O segundo número é: " + y + "; ");
                System.out.print("O terceiro número é: " + z + "; ");
            }else{
                System.out.print("O segundo número é: " + z + "; ");
                System.out.print("O terceiro número é: " + y + "; ");
            }
        }else if(y<x && y<z){
            System.out.print("O menor número é: " + y + "; ");
             if(x<z){
                System.out.print("O segundo número é: " + x + "; ");
                System.out.print("O terceiro número é: " + z + "; ");
            }else{
                System.out.print("O segundo número é: " + z + "; ");
                System.out.print("O terceiro número é: " + x + "; ");
            }
        }else{
            System.out.print("O menor número é: " + z + "; ");
             if(x<y){
                System.out.print("O segundo número é: " + x + "; ");
                System.out.print("O terceiro número é: " + y + "; ");
            }else{
                System.out.print("O segundo número é: " + y + "; ");
                System.out.print("O terceiro número é: " + x + "; ");
            }
        }

    }

}

