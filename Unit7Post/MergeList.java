package Unit7Post;

import java.util.Scanner;
//7.31Ìâ
public class MergeList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1:");
		int sum1 = input.nextInt();
		int [] list1 = new int[sum1];
		for(int i=0;i<sum1;i++) {
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2:");
		int sum2 = input.nextInt();
		int [] list2 = new int[sum2];
		for(int i=0;i<sum2;i++) {
			list2[i] = input.nextInt();
		}
		
		System.out.print("The merge list is ");
		for(int x:merge(list1,list2)) {
			System.out.print(x+" ");
		}
		
	}
	
	public static int[] merge(int[] list1,int[] list2) {
		int i1=0,i2=0,i=0;
		int [] list = new int[list1.length+list2.length];
		while((i1 < list1.length) && (i2 < list2.length)) {
			if(list1[i1] < list2[i2]) {
				list[i] = list1[i1];
				i1++;
			}else {
				list[i] = list2[i2];
				i2++;
			}
			i++;
		}
		while(i1 < list1.length) {
			list[i] = list1[i1];
			i++;
			i1++;
		}
		while(i2 < list2.length) {
			list[i] = list2[i2];
			i++;
			i2++;
		}
		return list;
	}
}
