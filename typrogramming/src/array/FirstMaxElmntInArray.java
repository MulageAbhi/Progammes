package array;

public class FirstMaxElmntInArray {

	public static void main(String[] args) {
		
		int arr[]= {10,54,23,35,43};
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("first maximum value is "+max);
	}

}
