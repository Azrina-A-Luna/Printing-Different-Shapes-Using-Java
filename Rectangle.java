
package azrina1;


public class Rectangle {
    public static void main(String[] args) {
        int i,j, row=4, column=5;
       for(i=1; i<=row; i++){
           for(j=1; j<=column; j++){
               if(i==1 || i==row || j==1 ||j==column){
                   System.out.print("*");   
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println("");
       }
    }
    
}
