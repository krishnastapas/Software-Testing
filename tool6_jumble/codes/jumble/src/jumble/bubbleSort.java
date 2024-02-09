package jumble;

public class bubbleSort {
	public static int[] sort(int[] arr,int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<j-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		 for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
		return arr;
	}

}
