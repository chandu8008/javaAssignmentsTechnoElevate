package classwork;

public class program10 {
	public static void main(String[] args) {
		int[] arr = {13,36, 34,18, 10,15,67};
		int small=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<arr[small]) {
				small =i;
			}
		}
		System.out.println("the smallest element is "+arr[small]);
		System.out.println("the index value is"+small);
	}

}
