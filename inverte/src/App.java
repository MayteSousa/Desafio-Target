import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner  leitor = new Scanner(System.in);
        String frase=" ";
        String inverso="";
        int tamanho=0;

        System.out.println("Digite uma Palavra: ");
        frase = leitor.nextLine();
    
        tamanho = frase.length();
    
        for(int j = tamanho-1; j>=0; j--){
            inverso = inverso + frase.charAt(j);
        }
                
        System.out.println(inverso);
    }
}
