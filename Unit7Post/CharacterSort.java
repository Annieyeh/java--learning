package Unit7Post;
//7.34��
public class CharacterSort {

	public static void main(String[] args) {
		String s = "basckd";
		
		//���ַ�������ַ�����
		char[] chs = s.toCharArray();
		sort(chs);
		//���ַ��������ַ���
		String result = new String(chs);
		System.out.println(result);
	}
	
	public static void sort(char[] chs) {
		for(int i=0;i<chs.length - 1;i++) {
			for(int j=0;j<chs.length-1-i;j++) {
				if(chs[j] > chs[j+1]) {
					char temp = chs[j];
					chs[j] = chs[j+1];
					chs[j+1] = temp;
				}
			}
		}
	}
}
