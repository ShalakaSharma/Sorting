
public class BubbleSort {

	public static void main(String args[]) {
		int[] arr = { 45, 10, 4, 15, 1 , -8, 15};
		arr = bubbleSortAscend(arr);
		System.out.print(arr[0]);
		for(int i=1; i<arr.length ; i++) {
			System.out.print(", " + arr[i]);
		}
		System.out.println();
		int[] arr2 = { 45, 10, 4, 15, 1 , -8, 15};
		arr2 = bubbleSortDescend(arr2);
		System.out.print(arr2[0]);
		for(int i=1; i<arr2.length ; i++) {
			System.out.print(", " + arr2[i]);
		}
	}

	public static int[] bubbleSortDescend(int arr[]) {
		int n = arr.length;
		for(int i = 0;i <n-1; i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] bubbleSortAscend(int arr[]) {
		int n = arr.length;
		for(int i = 0;i <n-1; i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}