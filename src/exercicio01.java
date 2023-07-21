import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {
        
        float[] notas = new float[50];
        String[] nomes = new String[50];
        float max = -1;
        int index = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.print("NOME DO ALUNO: " );
            nomes[i] = sc.nextLine();
            System.out.print("NOTA: ");
            notas[i] = Float.parseFloat(sc.nextLine());
            
            if (notas[i] > max) {
                max = notas[i];
                index = i;
            }

        }

        System.out.println("+++ ALUNO NOTA MÁXIMA +++");
        System.out.println(nomes[index]);        
        System.out.println("NOTA: " + notas[index]);


        
        sc.close();

    }
}
