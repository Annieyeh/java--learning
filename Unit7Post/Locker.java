package Unit7Post;
//7.23题
public class Locker {
	public static void main(String[] args) {

		boolean [] locker = new boolean[100]; //初始化100个储物柜，每个柜子都是关着的(false)
		for(int i=0;i<100;i++) {
			locker[i] = false;
		}
		
		for(int m=1;m<=100;m++) { //模仿学生打开关上柜子操作
			for(int n=m;n<=100;n+=m) {
				locker[n-1] = !locker[n-1];
			}
		}
		
		for(int i=0;i<100;i++) {
			if(locker[i]) {
				System.out.print(i+1+" ");
			}
		}
	}

}
