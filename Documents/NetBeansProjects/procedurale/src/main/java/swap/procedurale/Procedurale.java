/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package swap.procedurale;

/**
 *
 * @author antonio
 */
    public class Procedurale {


    public static void main(String[] args) {
        int base=0;
        int esponente=0;
        int potenza = 1;
        potenza(base,esponente,potenza);
    }
        static void potenza(int base, int esponente, int potenza) {
        for (int i = 0; i < esponente; i++) {
            potenza = potenza * base;
        }
        System.out.println("la potenza:" + potenza );
        
    }
        

}
