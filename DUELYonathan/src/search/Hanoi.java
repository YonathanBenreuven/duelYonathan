package search;

public class Hanoi {
	public static void main(String[] args) {
	solution(7,"A","B","C");
	}

	public static void solution(int n,String start, String helper, String end) {
		if(n==1) {
			System.out.println(start+"->"+end);
		}else {
			solution(n-1,start,end,helper);
			System.out.println(start+"->"+end);
			solution(n-1,helper,start,end);
		}
		
	}
}
