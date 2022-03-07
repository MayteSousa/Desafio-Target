import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero, n1=1, n2=0;     
        boolean resultado = false;   

        Scanner  leitor = new Scanner(System.in);

        System.out.print("Digite número inteiro: ");
        numero = leitor.nextInt();

        System.out.println(n2);
        System.out.println(n1);
        
        for (int i = 0; i < numero; i++){
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println(n1);
            
            if (n1 == numero){
                resultado = true;
            }
        }

        if (resultado == true){
            System.out.println(" ");
            System.out.println(numero + " pertence a sequência Fibonacci");
        }            
    }
}
