
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92};
		int[] newArray =  bubbleSortMethod(array);
		for(int i = 0; i< newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}

	}
	public static int[] bubbleSortMethod(int[] array) {
		int n = array.length;
		for(int i = 0;i<n-1;i++) {
			for (int j =  0; j<n-1;j++) {
				if(array[j]>array[j+1]) {
					int tmp;
					tmp = array[j];
					array[j]= array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		return array;
	}

}
