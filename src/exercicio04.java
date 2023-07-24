import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        
        int[] arrayA = new int[29];
        int[] arrayB = new int[29];
        int parameter, index = 0;

        Scanner sc =  new Scanner(System.in);

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Digite um valor para a posição " + i + " da lista A");
            arrayA[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Digite um valor para a posição " + i + " da lista B");
            arrayB[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Digite o valor do parâmetro: ");
        parameter = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == parameter) {
                index = i;
            }
        }

        System.out.println("O valor procurado na lista B é :" + arrayB[index]);
        
        sc.close();
    }
    
}
