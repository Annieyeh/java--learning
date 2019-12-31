package Unit7Post;
//7.18Ã‚
public class Sort {

	public static void main(String[] args) {
		double[] array = {2,4,9,7,6,5};
		Sort sort = new Sort();
		sort.bubbleSort(array);
		for(double x:array) {
			System.out.print(x+" ");
		}
	}

	public void bubbleSort(double[] array) {
		for(int i=0;i<array.length-1;i++) {
			boolean bl = true;
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j] > array[j+1]) {
					bl = false;
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			if(bl) {
				break;
			}
		}
	}
}
