package search;

public class RecursionExercises {
	
	 public static void main(String[] args){
		 int value = 18;
		 int counter =0;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 }

		 public static int countPrimeFactors(int value, int testPrime) {
			 
				 return 0;
			  
		 }

		 public static int factorial(int value) {
		 if(value==0) {
		 return 1;
		 }else {
			 return value * factorial(value-1); 
		 }
		 }
}
