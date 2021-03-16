
package backpackers;

import java.util.Arrays;
import java.util.Scanner;


public class Backpackers {
    public static void main(String[] args) {
        
        int[] arrayItems;
        int sumWeight1 = 0;
        int sumWeight2 = 0;        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number of items: ");
        int numItems = Integer.parseInt(sc.nextLine());
                
        while(numItems<3 || numItems > 15){
            System.out.println("Invalid number of items: \n");
            System.out.println("Insert valid number of items: ");
            numItems = Integer.parseInt(sc.nextLine());
        }
        
        arrayItems = new int[numItems];
        for(int i =0; i<numItems; i++) {
            System.out.println("Insert weigth of the item: ");
            int weightItem = Integer.parseInt(sc.nextLine());
            
            while(weightItem < 5 || weightItem > 600){
                System.out.println("Incorrect weight. Insert another one: ");
                weightItem = Integer.parseInt(sc.nextLine());
            }
            arrayItems[i] = weightItem;
        }
        
        Arrays.sort(arrayItems);      

        for(int i=numItems-1; i>=0; i--){
           
            if(sumWeight1 > sumWeight2){
                sumWeight2 =  sumWeight2 + arrayItems[i];
            } else{
                sumWeight1 = sumWeight1 + arrayItems[i];
            }
            
        }
        
       if(sumWeight1 > sumWeight2){
           System.out.println("Backpacker1: " + sumWeight1);
           System.out.println("Backpacker2:" + sumWeight2);
       }else{
           System.out.println("Backpacker1: " + sumWeight2);
           System.out.println("Backpacker2:" + sumWeight1);
       }

    }
}
