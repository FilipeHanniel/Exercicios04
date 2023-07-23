import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        
        float[] temp = new float[121];
        float menorTemp = 9999999, maiorTemp = -1, media = 0, qDiasMenorMedia = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < temp.length; i++) {
            temp[i] = Float.parseFloat(sc.nextLine());
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < menorTemp) {
                menorTemp = temp[i];
            }

            if (temp[i] > maiorTemp) {
                maiorTemp = temp[i];
            }

            media = temp[i] + media;
        

        }

        media = media / 121;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < media) {
                qDiasMenorMedia += 1;
            }
        }


        sc.close();


    }
    
}
