package Unit7Post;

import java.util.Scanner;
//7.19Ìâ
public class CheckSort {

	public static void main(String[] args) {
		System.out.print("Enter list:");
		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
		int [] num = new int[sum];
		for(int i=0;i<sum;i++) {
			num[i] = input.nextInt();
		}
		if(isSorted(num)) {
			System.out.println("The list is already sorted");
		}else {
			System.out.println("The list is not sorted");
		}
	}

	
	public static boolean isSorted(int[] list) {
		int check = 0;
		for(int i=0;i<list.length-1;i++) {
			if(list[i] > list[i+1]) {
				check = 1;
				break;
			}
		}
		if(check == 1) {
			return false;
		}else {
			return true;
		}
	}
}
