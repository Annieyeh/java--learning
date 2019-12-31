package Unit9Post;

import java.util.Scanner;
//9.13题
public class Location {

	public int row;
	public int column;
	public double maxValue;
	
	public static Location locateLargest(double[][] a) {
		int r = -1;//行
		int c = -1;//列
		double max = -1;//最大值
		for(int i=0;i<a.length;i++) {//a.length行数
			double[] ai = a[i];
			for(int j=0;j<ai.length;j++) {
				if(max < ai[j]) {
					r = i;
					c = j;
					max = ai[j];
				}
			}
		}
		Location location = new Location();
		location.row = r;
		location.column = c;
		location.maxValue = max;
		return location;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of row and cloumns in the array:");
		int row = input.nextInt();
		int column = input.nextInt();
		double [][] a = new double[row][column];
		System.out.print("Enter the array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j] = input.nextDouble();
			}
		}
		Location location = locateLargest(a);
		
		System.out.println("The location of the largest element is "+location.maxValue+" at (" + location.row+","+location.column+")");

	}

}
