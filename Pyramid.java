
package azrina1;

import java.util.Scanner;


public class Pyramid {
    public static void main(String[] args) {
        
        int i, j, row, space, star; 
        Scanner input = new Scanner(System.in);
        row=input.nextInt();
        int change=(row+1)/2;
        space= row-1;
        star=1;
        for(i=1; i<=row; i++){
            for(j=0; j<space; j++){
                System.out.print(" ");
            }
            for(j=0; j<(star*2)-1; j++){
                System.out.print("*");
            }
            System.out.println("");
            if(i<change){
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
        }
    }
    
}
