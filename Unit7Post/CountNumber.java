package Unit7Post;

import java.util.Scanner;
//7.3Ã‚
public class CountNumber {

	public static void main(String[] args) {
		System.out.print("Enter the integers between 1 and 100:");
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			int [] a = new int[100];
			int [] b = new int[100];
			for(int i=0;;i++) {
				a[i] = input.nextInt();
				if(a[i] == 0) {
					break;
				}
				b[a[i]] ++;
			}
			for(int i=0;i<100;i++) {
				if(b[i] == 1) {
					System.out.println(i + " occurs " + b[i] + " time");
				}else if(b[i] > 1) {
					System.out.println(i + " occurs " + b[i] + " times");
				}
			}
		}

	}

}
