
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92};
		int[] newArray =  insertionSortMethod(array);
		for(int i = 0; i< newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}
	}
	public static int[] insertionSortMethod(int[] array) {
		int n = array.length;
		for(int i = 1;i<n;i++) {
			int key = array[i];
			int j = i-1;
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		return array;
	}

}
