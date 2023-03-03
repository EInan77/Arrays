/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.arrays;

/**
 *
 * @author ereni
 */
public class Arrays {

    public static void main(String[] args) {
        int[] counts = new int[10];
        for(int i = 0; i < counts.length; i++){
            counts[i]=0;
           System.out.println(counts[i]);
        }
        
        int[] bonus = new int[15];
        for(int i = 0; i < bonus.length; i++){
        bonus[i]+=1;
        System.out.println(bonus[i]);
    }
        int [] bestScores = {100, 93, 98,89, 95};
        System.out.println("These are the best scores reported: ");
        for(int i = 0; i < bestScores.length; i++){
        System.out.println(bestScores[i]);
    }
    }
}
