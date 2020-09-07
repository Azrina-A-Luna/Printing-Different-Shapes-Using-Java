
package azrina1;

public class SquareShape {
    public static void main(String[] args) {
        
    int i, j, row=5;
    
    for(i=1; i<=row; i++){
     for(j=1; j<=row; j++){
      if(i==1 || i==row || j==1 ||j==row){
          System.out.print("* ");          
      }
      else{
          System.out.print("  ");
      }
     
     }
        System.out.println("");
    }
    
    }
    
}
