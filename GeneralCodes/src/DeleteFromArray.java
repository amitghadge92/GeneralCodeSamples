import java.util.stream.IntStream;

public class DeleteFromArray {

	public static void main(String[] args) {

		int[] arr = { 2, 0, 9, 3 };
		try {
			// System.out.println("res: "+ delete(arr,5));
			display(deleteByStream(arr, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void display(int arr[]) {
		System.out.print("Array is: [");
		for (int i : arr) {
			System.out.print(" " + i);
		}
		System.out.print("]");
	}

	
	/**
	 * @param arr
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public static int delete(int arr[], int index) throws Exception {

		if (index >= arr.length)
			throw new Exception("Index is greater than size of array");
		int res = arr[index];

		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return res;

	}

	/**
	 * Delete the element of the array with streams
	 * @param arr
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public static int[] deleteByStream(int arr[], int index) throws Exception {

		if (index >= arr.length)
			throw new Exception("Index is greater than size of array");

		return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();

	}

}
