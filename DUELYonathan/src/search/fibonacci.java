package search;

public class fibonacci {
	public static void main(String[] args) {
		System.out.println( findFibonacci(4));
	}
	
	public static int findFibonacci(int n) {
		if(n==1||n==0) {
			return 1;
		}else {
			return findFibonacci(n-1)+findFibonacci(n-2);
		}
		
	}
}
