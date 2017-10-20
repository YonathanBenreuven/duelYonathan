package Arrays2d;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// increases element at psn decreases neighbors by 1 avoid index out of bounds
	public static void changeNeightbors(int[] arr, int psn) {
		if(arr.length>psn) {
			arr[psn]=arr[psn]+1;
			if(psn!=0) {
				arr[psn-1]=arr[psn-1]-1;
			}
			if(arr.length-1>psn) {
				arr[psn+1]=arr[psn+1]-1;
			}
		}
	}
}
