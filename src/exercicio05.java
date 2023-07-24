import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        
        String[] phrase = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < phrase.length; i++) {
            phrase[i] = sc.nextLine();
        }
        System.out.println("=================================================");
        for (int i = 0; i < phrase.length; i++) {
            System.out.println(phrase[i]);
        }


        sc.close();

    }
    
}
