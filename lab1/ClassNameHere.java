public class ClassNameHere {
   public static int max(int[] m) {
	int i = 1;
	int maxValue = m[0];
	while(i<m.length) {
		if(m[i]>maxValue) {
			maxValue = m[i];
		}
		i++;
	}
       return maxValue;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};   
      System.out.println("the max value in this array is " + max(numbers));   
   }
}