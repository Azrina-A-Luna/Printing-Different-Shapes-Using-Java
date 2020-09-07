
package azrina1;

public class Shape1 {
    public static void main(String[] args) {
        int i, j;
        int row=5;
       for(i=1; i<=row; i++){//row
           for(j=0; j<i; j++){//column
               System.out.print(" * ");
           }
           System.out.println("");
       }
    }
    
}
