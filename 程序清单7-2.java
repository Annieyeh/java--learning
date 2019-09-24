package hahaha;

public class Anan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []desk=new int[52];
		String[] suits={"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		for(int i=0;i<desk.length;i++)
			desk[i]=i;
		for(int i=0;i<desk.length;i++){
			int index=(int)(Math.random()*desk.length);
			int temp=desk[i];
			desk[i]=desk[index];
			desk[index]=temp;
	}for(int i=0;i<4;i++){
		String suit = suits[desk[i]/13];
		String rank = ranks[desk[i]%13];
		System.out.println("Card number "+desk[i]+":"+rank+" of "+suit);
	}

}
}