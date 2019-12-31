package Unit3;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(System.currentTimeMillis()%10);//生成两个随机数
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		//currentTimeMillis()这个方法得到的是自1970年1月1日零点到目前计算这一刻所经历的的毫秒数
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " + " + number2 +"?");
		
		int answer = input.nextInt();
		
		System.out.println(
			number1 + " + " + number2 + " = " + answer + " is " +
			(number1+number2 == answer));//boolean表达式
	  }

}
		
