package cm.test.sapient;

public class FindMaxInArray_on2 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		int maxIndexDiff = maxIndexDiff(arr, arr.length);
		System.out.println(maxIndexDiff);
	}

	static int maxIndexDiff(int arr[], int n) {
		int maxDiff = -1;
		int i, j;

		for (i = 0; i < n; ++i) {
			for (j = n - 1; j > i; --j) {
				System.out.println("maxDiff:" + maxDiff + "<-Arr[j]-->" + arr[j] + "<--Arr[i]-->" + arr[i]);
				if (arr[j] > arr[i] && maxDiff < (j - i)) {

					maxDiff = j - i;
				}
			}
		}

		return maxDiff;

	}

}
