/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package swap.potenza;

/**
inizializza n p t
chiedi all'utente di mettere dei valori in n p t

 */
import java.util.Scanner;
public class Potenza {

    public static void main(String[] args) {
        int n;
        int p;
        int t = 1;
        Scanner input = new Scanner (System.in);
        System.out.println("inserisci la base:");
        n = input.nextInt();
         System.out.println("inserisci l'esponente:");
        p = input.nextInt();
        for (int i = 0; i < p; i++) {
            t = t * n;
            }
            System.out.println("inserisci il totale: " + t  );
    }
}
