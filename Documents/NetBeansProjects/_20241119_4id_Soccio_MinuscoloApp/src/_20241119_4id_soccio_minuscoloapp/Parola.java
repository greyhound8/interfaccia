/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _20241119_4id_soccio_minuscoloapp;

/**
 *
 * @author ospite
 */
import java.util.Scanner;

public class Parola {

    static final int TANTI = 30;
    private String parola; // stringa come oggetto 
    char[] mauiscolo = new char[TANTI];// stringa come array 

    // trasforma la stringa letta in un array di caratteri 
    /**
     *
     */
    public void Input() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInserisci una parola: ");
        parola = in.next();// legge una stringa 
    }

    public void Controllo() {
        for (int x = 0; x < parola.length(); x++) {
            mauiscolo[x] = parola.charAt(x); // trasforma la parola in minuscolo
        }
        System.out.print("La parola in minuscolo (array): ");
        for (int x = 0; x < parola.length(); x++) {
            mauiscolo[x] = Character.toLowerCase(mauiscolo[x]); // primo carattere letto 
        }
            // in minuscolo 

            // visualizza la parola carattere per carattere 
        for (int x = 0; x < mauiscolo.length; x++) {
            System.out.print(mauiscolo[x]);
        }
    }

    public void StampaMin() {
        // trasformo da array di caratteri a stringa 
        String parolaMinu = new String(mauiscolo);
        System.out.print("\nLa parola in minuscolo (oggetto): ");
        System.out.println(parolaMinu);

    }
}
