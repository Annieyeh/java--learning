package Unit7Post;

import java.util.Scanner;
//7.17��
public class SortStudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ѧ��������");
		int sum = input.nextInt();
		
		String [] name = new String[sum];
		int [] score = new int[sum];
		
		System.out.print("������ѧ����������");
		for(int i=0;i<sum;i++) {
			name[i] = input.next();
		}
		
		System.out.print("������ѧ���ĳɼ���");
		for(int i=0;i<sum;i++) {
			score[i] = input.nextInt(); 
		}
		
		for(int i=0;i<sum-1;i++) {
			for(int j=0;j<sum-1-i;j++) {
				if(score[j] < score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
					String temp2 = name[j];
					name[j] = name[j+1];
					name[j+1] = temp2;
				}
			}
		}
		
		for(String x:name) {
			System.out.println(x);
		}
	}
}
