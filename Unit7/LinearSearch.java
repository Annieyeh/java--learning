package Unit7;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] list = {1,2,3,4};
		int n = 1;
		int p = linearSearch(list,n);
		System.out.println(p);
		
	}
	
	public static int linearSearch(int[] list, int key) {
		for(int i=0;i<list.length;i++) {
			if(key == list[i]) {
				return i;
			}
		}
		return -1;
	}

}
