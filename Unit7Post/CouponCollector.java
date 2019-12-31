package Unit7Post;
//7.24题
public class CouponCollector {

	public static void main(String[] args) {
		boolean [] color = new boolean[4]; //存放每种花色的抽取情况
		boolean flag = false; //四种花色是否都抽到了
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
		int [] deck = new int[52]; //用来存放52张牌
		String[] Huases = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		//初始化
		for(int i = 0;i < deck.length;i++) {
			deck[i] = i;
		}
		
		//进行洗牌
		for(int i=0;i<deck.length;i++) {
			int index = (int)(Math.random()*deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		//从52张牌中任选一张进行抽牌
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
