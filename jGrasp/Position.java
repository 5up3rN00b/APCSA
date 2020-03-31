public class Position {
   private int r, c;

   public Position (int r, int c) {
      this.r = r;
      this.c = c;
   }
   
   public String toString() {
      return r + " " + c;
   }
   
   public static Position findPosition(int num, int[][] intArr) {
      int x = -1;
   	int y = -1;
   	for (int i = 0; i < intArr.length; i++) {
    		for (int j = 0; j < intArr[i].length; j++) {
         	if (intArr[i][j] == num) {
         		x = i;
         		y = j;
            }
         }
      }

      if (x < 0 || y < 0) {
       	return null;
      } else {
        	return new Position(x, y);
      }
   }
   
   public static Position[][] getSuccessorArray (int[][] intArr) {
      Position[][] posArray = new Position[intArr.length][intArr[0].length];
   	for (int i = 0; i < intArr.length; i++) {
   		for (int j = 0; j < intArr[i].length; j++) {
         	posArray[i][j] = findPosition(intArr[i][j] + 1, intArr);
         }
      }
      
      return posArray;
   }
   
   public static void main(String[] args) {
      int[][] array = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
      Position[][] posArray = getSuccessorArray(array);
      for (int i = 0; i < posArray.length; i++) {
         for (int j = 0; j < posArray[0].length; j++) {
            System.out.println(posArray[i][j]);
         }
      }
   }
}