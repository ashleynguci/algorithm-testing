
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
///Best case: O(n), Worst case: O(n^2), space complexityO(1)
///When choosing a sorting algorithm to use, weigh these factors. 
///For example, quicksort is a very fast algorithm but can be pretty tricky to implement;
/// bubble sort is a slow algorithm but is very easy to implement. 
///To sort small sets of data, bubble sort may be a better option since 
///it can be implemented quickly, but for larger datasets, 
///the speedup from quicksort might be worth the trouble implementing the algorithm.