/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_soccio_verifica;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Studenti {

    private String nomi;
    private int voti[];
    private float mVoti;
    private int studenti = 3;

    public void studenti() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < studenti; i++) {
            System.out.println("il nome dello studente numero " + i);
            nomi = scan.nextLine();
            System.out.println("----------------------------");
        }
    }

    public void Voti() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("i voti del studente " + i  );
            System.out.println("sono ");
            int voto = scan.nextInt();
            voti[i] = voto;
        }
        mVoti = (voti[0] + voti[1] + voti[2]) / 3;
        System.out.println("la media è" + mVoti);

        if (mVoti < 6) {
            System.out.println("lo studente é bocciato");
        } else {
            System.out.println("lo studente é promosso");
        }

    }
}
