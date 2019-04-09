
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 6, 0, 92,1, -1, -3, 2 };
		int[] newArray = selectionSortMethod(array);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

	public static int[] selectionSortMethod(int[] array) {
		int n = array.length;

		for (int j = 0; j < n-1; j++) {
			int min_index=j;
			for (int i = j+1; i < n; i++) {
				if (array[i] < array[min_index]) {
					min_index = i;
				}
			}
			int tmp = array[j];
			array[j] =array[min_index];
			array[min_index]=tmp;
		}
		return array;
	}

}
