import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        
        int[] idades = new int[250];
                
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 251; i++) {

            System.out.print("Digite a idade na posição " + i +" : " );
            idades[i] = Integer.parseInt(sc.nextLine());            

        }

        for (int i = 1; i < 251; i++) {
            
            System.out.println("Idade na posição " + i + " : " + idades[i]);
        }


        
        sc.close();

    }
    
}
