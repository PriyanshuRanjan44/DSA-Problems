package Week_2;

public class RotateMatrix {
    public static void main(String[] args) {
      int matrix[][] = {
    		  {1,2,3},
    		  {4,5,6},
    		  {7,8,9}
      };
      int rows = matrix.length;
      int cols = matrix[0].length;
      int[][] result = new int[cols][rows];

      for (int i = 0; i < cols; i++) {
          for (int j = 0; j < rows; j++) {
              result[i][j] = matrix[j][i];
          }
      }
//      int[][] result2 = new int[cols][rows];
      for(int i = 0; i<result.length; i++) {
    	  int temp = result[i][0];
    	  result[i][0] = result[i][2];
    	  result[i][2] = temp;
      }

      
      System.out.println("Transpose Array: ");
      for(int i = 0; i<result.length; i++) {
    	  for(int j = 0; j<result[0].length; j++) {
    		  System.out.print(result[i][j]+" ");
    	  }System.out.println();
      }
     
    }
  
}
