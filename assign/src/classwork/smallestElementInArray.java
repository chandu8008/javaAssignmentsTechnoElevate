package classwork;

public class smallestElementInArray {
public static void main(String[] args) {
	int[] arr = {13,36,34,18,10,15,67};
	for(int i=0; i<arr.length-1;i++) {
		for(int j=0; j<arr.length-1;j++) {
			if(arr[i]>arr[j+1]) {
				int temp=arr[i];
				arr[j]=arr[j+1];
				arr[j=1]=temp;
			}
		}
	}
	for(int i=0; i<arr.length-1; i++) {
	System.out.println(arr[i]);
}
}
}
