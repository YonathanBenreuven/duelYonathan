package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//objectArrays oA = new objectArrays();
		Person s = new Person("ben","Nockles",borough.NY_BOUROUGHS[0]);
		int x = 10;
		int[] a = {5,6,7};
		test(s,x,a);
		System.out.println(s+", "+x+", "+Arrays.toString(a));
	}
	public static void test(Person s, int x,int[] arr) {
		s.setFirstName("Ilona");
		x=5;
		//arr = new int[3]; if you dont make a new array the refernces will change
		// no method can permanently change an int (you can if you set it as a return type)
		//
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
	}
}
