package Unit7Post;
//7.24��
public class CouponCollector {

	public static void main(String[] args) {
		boolean [] color = new boolean[4]; //���ÿ�ֻ�ɫ�ĳ�ȡ���
		boolean flag = false; //���ֻ�ɫ�Ƿ񶼳鵽��
		int count = 0;
		while(flag == false) {
			if(color[0]&&color[1]&&color[2]&&color[3]) {
				flag = true;
			}else {
				switch(choosePai(color)){
	                case "Spades":
	                	color[0] = true;
	                    break;
	                case "Hearts":
	                	color[1] = true;
	                    break;
	                case "Diammonds":
	                	color[2] = true;
	                    break;
	                case "Clubs":
	                	color[3] = true;
	                    break;
	            }
			}
			count++;
		}
		System.out.println("Number of picks:"+count);
	}

	public static String choosePai(boolean [] color) {
		int [] deck = new int[52]; //�������52����
		String[] Huases = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		//��ʼ��
		for(int i = 0;i < deck.length;i++) {
			deck[i] = i;
		}
		
		//����ϴ��
		for(int i=0;i<deck.length;i++) {
			int index = (int)(Math.random()*deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		//��52��������ѡһ�Ž��г���
		int i = (int)(Math.random()*deck.length);
		String Huase = Huases[deck[i] / 13];
        String rank = ranks[deck[i]%13];
        switch(Huase){
        case "Spades":  
            if(!color[0])  
                {System.out.println(rank+" of "+Huase);color[0] = true;}  
            break;  
        case "Hearts":  
            if(!color[1])  
                {System.out.println(rank+" of "+Huase);color[1] = true;}  
            break;  
        case "Diamonds":  
            if(!color[2])  
                {System.out.println(rank+" of "+Huase);color[2] = true;}  
            break;  
        case "Clubs": 
            if(!color[3])  
                {System.out.println(rank+" of "+Huase);color[3] = true;}  
            break;  
        }
        return Huase;
	}
}
