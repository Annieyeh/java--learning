package Unit11Post;

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> answerList = new ArrayList<>();
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		answerList.add(answer);
		
		while(number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			
			if(!answerList.contains(answer)) {
				answerList.add(answer);
			}else {
				System.out.println("You already entered " + answer);
			}
		}
		
		System.out.println("You got it!");
	}

}
