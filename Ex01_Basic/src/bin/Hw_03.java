package bin;

public class Hw_03 {

	public static void main(String[] args) {
		//����� 1
		for(int i=2;i<=10;i++) {
			for (int j=1;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("----------------------------------");
		//����� 2
		for (int i=1; i<=10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("----------------------------------");
		//����� 3
		for (int i=1;i<=10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print("  ");
			}for (int k=0;k<i;k++) {
				System.out.print("*");
			}System.out.println();
		}
	
	}
}
