import java.util.*;

class Digits {
   private ArrayList<Integer> digitList;
   
   public Digits(int num) {
   
	   if (num == 0) digitList.add(0);
      
      digitList = new ArrayList<Integer>();

	   while (num != 0) {
	      int temp = num/10;
	      digitList.add(0, num-temp*10);
	      num/=10;
      }
   }
   
   public boolean isStrictlyIncreasing() {
	   if (digitList.size() == 1) return true;
	
	   boolean works = true;
	   for (int i = 1; i < digitList.size(); i++) {
	      if (digitList.get(i) <= digitList.get(i - 1)) {
	         works = false;
         }
      }
      
      return works;
   }
   
   public void getList() {
      for (Integer i : digitList) {
         System.out.println(i);
      }
   }
   
   public static void main(String[] args) {
      Digits d = new Digits(1345);
      System.out.println(d.isStrictlyIncreasing());
   }
}