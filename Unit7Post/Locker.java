package Unit7Post;
//7.23��
public class Locker {
	public static void main(String[] args) {

		boolean [] locker = new boolean[100]; //��ʼ��100�������ÿ�����Ӷ��ǹ��ŵ�(false)
		for(int i=0;i<100;i++) {
			locker[i] = false;
		}
		
		for(int m=1;m<=100;m++) { //ģ��ѧ���򿪹��Ϲ��Ӳ���
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
