import java.util.Random;
import java.util.Scanner;

public class gissaetttal {

    public static void gissa () {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean spelaigen = true;

        System.out.println("Gissa ett tal så ser vi om du kan gissa rätt samt hur många försök som behövdes!");

        while (spelaigen) {
            int datornsrandomtal = random.nextInt(100) +1;
            int antalförsök = 0;
            boolean gissaträtt = false;

            while (!gissaträtt) {
                System.out.print("Gissning" + " " + (antalförsök +1 ) + ":");
                if (scanner.hasNextInt()){
                int spelarensGissning = scanner.nextInt();
                antalförsök++;

                if (spelarensGissning == datornsrandomtal) {
                    gissaträtt = true;
                    System.out.println("Grattis! Du gissade rätt på " + antalförsök + " försök.");
                } else if (spelarensGissning < datornsrandomtal) {
                    System.out.println("Större! Försök igen!");
                } else {
                    System.out.println("Mindre! Försök igen.");
                }
            } else {
                System.out.println("Du får enbart använda siffror!");
                scanner.next();

            }
        }
                   

            System.out.print("Vill du spela igen? (ja/nej): ");
            String svar = scanner.next().toLowerCase();

            if (!svar.equals("ja")) {
                spelaigen = false;
            }
        }

        System.out.println("Tack för den här gången!");
        scanner.close();
    }
}


    
        
            

            
     







    
    

