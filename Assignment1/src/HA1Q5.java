/*Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, 
and finds the first row and column with the most 1s.*/

public class HA1Q5 {
	public static int largestRow(int[][] m) {
		int max = 0;
		int t = 0;
		for(int i = 0; i < m.length; i++) {
			int count = 0;
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] == 1)
					count++;
			}
			if(count > t) {
				t = count;
				max = i;	
			}
		}
		return max;
	}
	public static int largestColumn(int[][] m) {
		int maxColumn = 0;
		int mx = 0;
		for(int c = 0; c < m[0].length; c++) {
			int count = 0;
			for(int row = 0; row < m.length; row++) {
				if(m[row][c] == 1)
					count++;
			}
			if(count > mx) {
				mx = count;
				maxColumn = c;
			}
		}
		return maxColumn;
	}

	public static void main(String[] args) {
		int [][] a = new int[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				a[i][j] = (int)(Math.random()*2);
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " "); 
			}
			System.out.println();
		}
		System.out.println("The largest row index : " + largestRow(a));
		System.out.println("The largest column index : " + largestColumn(a));
		
	}

}
