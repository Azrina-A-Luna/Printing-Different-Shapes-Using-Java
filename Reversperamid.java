
package azrina1;


public class Reversperamid {
    public static void main(String[] args) {
                  int i, j, k;
       int row=5;
       for(i=row; i>=1; i--)
       {
           for(k=0; k<row-i; k++)
           {
               System.out.print(" ");
           }
           for(j=0; j<i; j++)
           {
               System.out.print("* ");
           }
           System.out.println("");
       }
    }
    
}
