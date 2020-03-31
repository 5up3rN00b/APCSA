public class binarySearch {
   public static void main(String[] args) {
      int[] a = new int[] {1, 2, 4, 5, 6, 8, 9, 11, 12, 15, 16};
   
      int left = 0;
      int right = a.length - 1;
      int mid = (left + right) / 2;
      int srch = 6;
      while (a[mid] != srch) {
         if (srch < a[mid]) {
            right = mid - 1;
         } else {
            left = mid + 1;
         }
         
         mid = (left + right) / 2;
      }
      
      System.out.println(mid);
      System.out.println(binSearch(a, 0, a.length - 1, 6));
   }
   
   public static int binSearch(int[] arr, int l, int r, int srch) {
      int mid = (l + r) / 2;
      if (srch < arr[mid]) {
         return binSearch(arr, l, mid - 1, srch);   
      } else if (srch > arr[mid]) {
            return binSearch(arr, mid + 1, r, srch);
      } else {
         return mid;
      }
   }
}