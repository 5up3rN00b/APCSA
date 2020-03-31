interface StudyPractice {
   String getProblem();
   void nextProblem();
}

public class MultPractice implements StudyPractice {
   private int firstInt;
  	private int secondInt;
   
  	public MultPractice(int n, int m) {
      firstInt = n;
   	secondInt = m;
   }

   public String getProblem() {
   	return firstInt + " TIMES " + secondInt;
   }

   public void nextProblem() {
   	secondInt++;
   }
   
   public static void main(String[] args) {
      StudyPractice p1 = new MultPractice(7, 3);
      System.out.println(p1.getProblem());
      p1.nextProblem();
      p1.nextProblem();
      System.out.println(p1.getProblem());
   }
}
