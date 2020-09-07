
package azrina1;

public class Shape3 {
    public static void main(String[] args) {
             int i, j, k;
       int row=5;
       for(i=1; i<=row; i++)
       {
           for(k=0; k<row-i; k++)
           {
               System.out.print(" ");
           }
           for(j=0; j<i; j++)
           {
               System.out.print(" *");
           }
           System.out.println("");
       }
    }
    
}
