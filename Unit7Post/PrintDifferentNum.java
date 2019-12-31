package Unit7Post;

import java.util.Scanner;
//7.5Ìâ
public class PrintDifferentNum {
	public static void main(String[] args) {
		int [] num = new int[10];
		int check = 0, k=0;
		System.out.print("Enter ten numbers:");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int a = input.nextInt();
//			System.out.println("a:"+a);
			for(int j=0;j<k;j++) {
				if(a == num[j]) {
					check = 1;
					break;
				}
			}
			if(check == 0) {
				num[k] = a;
//				System.out.println("num[k]:"+num[k]);
				k++;
			}
			check = 0;
//			System.out.println("k:"+k);
		}
		System.out.println("The number of distinct number is " + k);
		System.out.print("The distinct numbers are:");
		for(int i=0;i<k;i++) {
			System.out.print(num[i] + " ");
		}
//		for(int x:num) {
//			System.out.print(x+" ");
//		}
	}
}
