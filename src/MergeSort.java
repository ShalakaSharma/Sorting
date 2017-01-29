
public class MergeSort {
	
	public static void main(String args[]) {
		int[] arr = {5,3,14,10,2,5};
		mergeSort(arr,0,arr.length-1);
		System.out.print(arr[0]);
		for(int i=1;i<arr.length;i++) {
			System.out.print(", " + arr[i]);
		}
		System.out.println();
	}

	public static void mergeSort(int[] arr, int low, int high) {
	
		if(low<high) {
			int middle = (low+high)/2;
			mergeSort(arr,low, middle);
			mergeSort(arr,middle+1,high);
			merge(arr, low, middle, high);
		}		
		
	}
	public static void merge(int[] arr, int low, int middle, int high) {
		
		int size1 = middle-low + 1;
		int size2 = high-middle;

		int[] arrLeft = new int[size1];
		int[] arrRight = new int[size2];

		for(int i=0;i<size1;i++) {
			arrLeft[i] = arr[low + i];
		}

		for(int i=0;i<size2;i++) {
			arrRight[i] = arr[middle + 1 + i];
		}
		int i=0;
		int j=0;
		int k=low;
		while(i<size1 && j<size2) {
			if(arrLeft[i]<arrRight[j]) {
				arr[k] = arrLeft[i];
				i++;
			} else {
				arr[k] = arrRight[j];
				j++;
			}
			k++;
		}

		while(i<size1) {
			arr[k] = arrLeft[i];
			i++;
			k++;
		}
		while(j<size2) {
			arr[k] = arrRight[j];
			j++;
			k++;
		}
				
	}
}
