import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        
        char[] list = new char[79];
        String phrase;
        int countWhite = 0, countA = 0, countPair = 0;

        Scanner sc = new Scanner(System.in);
       
        phrase = "Explore o mundo, vença desafios e torne-se lendário! A partir daí vá e avance!!!";
        System.out.println(phrase);
        for (int i = 0; i < list.length; i++) {
            list[i] = phrase.charAt(i);
            if (list[i] == ' ') {                
                countWhite += 1;
            } else if (list[i] == 'a') {                ;
                countA += 1;
            }            
        }
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j] && list[i] != ' ') {
                    countPair += 1;
                }
            }  
        }

        System.out.println("Nº de ítens brancos: " + countWhite);
        System.out.println("Nº de vezes em que a letra 'a' ocorre: " + countA);
        System.out.println("Nº de vezes em que ocorre pares de letras: " + countPair);

        sc.close();

    }
    
}
