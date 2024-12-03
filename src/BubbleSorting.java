
public class BubbleSorting {
public static void main(String[] args) {
	int[] arr= {3,1,0,5,2};
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i] + " ");
	}
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	System.out.println("After ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i] + " ");
	}
	
}
}
