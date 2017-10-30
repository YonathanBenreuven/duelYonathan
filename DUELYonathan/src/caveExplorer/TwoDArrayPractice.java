package caveExplorer;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		String[][] pic = new String[6][10];
		for(int row = 0; row<pic.length; row++) {
			for(int col =0; col<pic[row].length;col++) {
				pic[row][col]= " test";
			}
		}
		
		drawBox(pic,4,5);
		print(pic);
	}
	// ___
	// |*|
	// |_|
	
	private static void drawBox(String[][] pic, int i, int j) {
		pic[i][j]="*";
		
		drawSlot(pic,i,j);
		drawSlot(pic,i+1,j);
		drawIfInBounds("_",pic,i+1,j);
		drawIfInBounds("_",pic,i-1,j);
		drawIfInBounds("_",pic,i-1,j-1);
		drawIfInBounds("_",pic,i-1,j+1);
		
		
	}
	private static void drawIfInBounds(String string, String[][] pic, int i, int j) {
		//always check row before column
		
		if(i>=0&&i<pic.length&& j>=0&& j<pic[i].length) {
		pic[i][j] = string;	
		}
		
	}
	// slot looks like | | a | infront and after i,j
	private static void drawSlot(String[][] pic, int i, int j) {
		if(i>=0&&i<pic.length) {
		if(j!=0) {
			pic[i][j-1]="|";
		}
		if(j<pic[i].length-1) {
			pic[i][j+1]="|";
		}
		}
	}
	private static void drawVerticalLine(String[][] pic, int col) {
		for(int row=0; row< pic.length;row++) {
			pic[row][col] = "|";
		}
		
	}
	private static void drawHorizontalLine(String[][] pic, int row) {
		for(int col=0; col< pic[row].length;col++) {
			pic[row][col] = "_";
		}
		
	}
	// prints contents of pics row by row no brackets or commas
	private static void print(String[][] pic) {
		String currentLine = "";
		for(int row = 0; row<pic.length; row++) {
			for(int col =0; col<pic[row].length;col++) {
				currentLine += pic[row][col]+" ";	
			}
			currentLine += "\n";
		}
		System.out.println(currentLine);
	}

}
