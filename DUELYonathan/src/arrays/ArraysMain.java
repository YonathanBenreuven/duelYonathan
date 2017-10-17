package arrays;

import java.util.Arrays;

public class ArraysMain {
	//private int[] testArray = {0,1,2,3,4};
	private String[] testArray;
	private int[] intRay;
	private int[] qasd = {1,2,3,7,8,9,11};
	private int first = 0;
	
	public ArraysMain() {
		intRay = new int[100];
		//populate (intRay);
		//checkoccurences(intRay,3,18);
		populate1ToN(intRay);
		//printls(intRay);
		//reverse(intRay);
		//shuffle(intRay);
		 //countLessThan(intRay,1);
		//frontToBack(intRay);
		lcs(intRay);
		//Arrays is a utility class inculded in java for 
		System.out.println(Arrays.toString(intRay));
		System.out.println(Arrays.toString(lcsp(qasd)));
	}
	private int[] printls(int[] arr) {
		// TODO Auto-generated method stub
		int[] longestsequence = new int[lcsp(arr)[0]];
		for(int i=0;i<lcsp(arr)[0]-1;i++) {
			longestsequence[i]=lcsp(arr)[i];
		}
		return longestsequence;
	}
	private int pullthelever() {
		return lcs(intRay);
	}
	private int lcs(int[] str) {
		// TODO Auto-generated method stub
		int maxvalue = 0;
		  int current = 1;
		  if(str.length==0){
		      first = -1;  
			  return 0;
		        
		      }
		  for(int i=0;i<str.length-1;i++){
		    if(str[i+1]==str[i]+1){
		      current++;
		    }else{
		      
		      if(maxvalue<current){
		    	  first = i+1;
		        maxvalue=current;
		      }
		      current = 1;
		    }
		  }if(maxvalue<current){
			  
		        maxvalue=current;
		      }
		     
		  return maxvalue;
	}
	public int[] lcsp(int[] arr) {
		int[] murp = {0,0};
		murp[0]=lcs(arr);
		
		murp[1]=first;
		return murp;
	}
	private int countLessThan(int[] arr, int lessthen) {
		// TODO Auto-generated method stub
		int lessnum = 0;
		for(int value: arr) {
			if(value<lessthen) {
			lessnum++;	
			}
			
		}
		return lessnum;
	}
	private int[] reverse(int[] arr) {
		// TODO Auto-generated method stub
		int[] temRay = new int[arr.length];
		
		for(int i=arr.length-1;i>-1;i--) {
			temRay[i] = arr[arr.length-i-1];
		}
		return temRay;
	}
	private void shuffle(int[] arr) {
		// TODO Auto-generated metho d stub
		for(int i=0;i<arr.length;i++) {
			
			swap(arr,(int)(Math.random()*arr.length),(int)(Math.random()*arr.length));
		}
	}
	private void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		int[] temp = {0};
		temp[0]= arr[first];
		arr[first]= arr[second];
		arr[second]= temp[0];
	}
	private void populate1ToN(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			arr[i] = i + 1;
		}
	}
	private void checkoccurences(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int[] counter = new int[end-start+1];
		for(int value: arr) {
			counter[value-start]++;
		}
		for(int i=0;i<counter.length; i++) {
			System.out.println("A "+(start+i)+" was rolled " + counter[i]+" times.");
		}
	}
	private void populate(int[] intRay) {
		for(int i=0;i<intRay.length;i++) {
			intRay[i] = diceRoll(3);
		}
		//this does not work
		//for(int value: intRay) {
			//value = diceRoll(2);
		//}
	}
	public void notes() {
		// collection of primitives or objects
				//special note: this is the only collection of primitives
				//size cannot be modified
				// elements of an array are references to objects
				//in other words changing an element of an array
				//changes the reference not the object more
				//on this later
				
				
				// there two types of constructors first weve seen
				int[] firstType= {3,14,-9,10};
				//this can only be used as a declaration
				// this will give error firstType = {12,13,14,15};
				
				//second type
				testArray = new String[50];
				/*special note for primitive arrays when they are
				 instantiated they are automatically populated with 0s
				  this is not the case with object arrays which are populated
				  with null
				 * */
				//standard loop
				for(int i=0; i< testArray.length; i++) {
					System.out.println("the " + i + "the item is:" + testArray[i]);
				}
				
				// for each loop only when you dont need index
				for(String value:testArray) {
					//"for each int in testArray"
					System.out.println(value);
				}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysMain arrayPractice = new ArraysMain();
	}
	public int diceRoll(int numberOfDice) {
		int sum = 0;
		for(int i =0; i<numberOfDice;i++) {
			sum += (int)(Math.random()*6)+1;
		}
		return sum;
	}
}
