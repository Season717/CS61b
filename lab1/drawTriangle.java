public class drawTriangle {
	public static void drawTree(int maxLine) {
		int i = 0;
		int star = 1;
		while (star<=maxLine) {
			if (i == (star-1)) {
				System.out.println("*");
				star = star + 1;
				i = -1;
			} else {
			System.out.print("*");
			}
			i = i + 1;
		}
	}
	public static void main (String[] args) {
		int N = 10;
		drawTree(N);
	}
}
		