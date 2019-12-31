package Unit7Post;
//7.32Ã‚
public class PartitionList {

	public static void main(String[] args) {
		int [] list = {10,1,5,16,61,9,11,1};
		Switch(list);
		for(int x:list) {
			System.out.print(x + " ");
		}
		
	}
	
	public static void Switch(int[] list) {
		int i=0,j=list.length-1;
		int flag = list[0];
//		int count = 1;
		while(i<j) {
			while(flag <= list[j] && i<j) {
				j--;
			}
			while(flag >= list[i] && i<j) {
				i++;
			}
			if(i<j) {
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;			
			}
//			System.out.print(count+":");
//			for(int x:list) {
//				System.out.print(x + " ");
//			}
//			System.out.println();
//			count++;
		}
		list[0] = list[i];
		list[i] = flag;
	}
	
}
