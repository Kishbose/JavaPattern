package JavaPatterns;

public class Min_Value_Array {
	// Initialize array
	static int a[] = { 4, 7, 9, 3, 76, 4, 3, 96 };

	public static void min() {

		// Initialize min with first element of array.
		int min = a[0];
		// Loop through the array
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
			}
			// Compare elements of array with min
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("Smallest element present in given array: " + min);
	}

	public static void main(String[] args) {
		min();
	}

}
