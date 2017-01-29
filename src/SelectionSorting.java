
public class SelectionSorting {

	public static void main(String[] args) {
		int arr[] = {10, 3, 39, 2, 5, 1, 39};
		arr = selectionSortAscend(arr);
		System.out.print(arr[0]);
		for(int i=1; i<arr.length;i++) {
			System.out.print("," + arr[i]);
		}
		System.out.println();
		int[] arr2 = {10, 3, 39, 2, 5, 1, 39};
		arr2 = selectionSortDescend(arr2);
		System.out.print(arr2[0]);
		for(int i=1; i<arr2.length;i++) {
			System.out.print("," + arr2[i]);
		}
		System.out.println();
		int[] arr3 = {10, 3, 39, 2, 5, 1, 39};
		arr3 = selectionSortDescend(arr3);
		System.out.print(arr3[0]);
		for(int i=1; i<arr3.length;i++) {
			System.out.print("," + arr3[i]);
		}
		System.out.println();
	}
	
	public static int[] selectionSortAscend(int[] arr) { 
		
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static int[] selectionSortDescend(int[] arr) { 
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int max = arr[i];
			int maxIndex = i;
			for(int j=i+1;j<n;j++) {
				if(max<arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	public static int[] selectionSortDescendUsingMin(int[] arr) { 
		int n = arr.length;
		for(int i=n-1;i>=0;i--) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(min>arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}