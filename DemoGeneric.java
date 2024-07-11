
package DemoGeneric;

public class DemoGeneric {
	public static void main(String[] args) {
		// Tạo mảng Integer, Double và Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 1.2, 1.3, 1.4 };
		Character[] charArray = { 'H', 'I', 'E', 'U', 'L' };

		System.out.println("Array integerArray contains: ");
		printArray(intArray); // Truyền vào mảng integer

		System.out.println("Array doubleArray contains: ");
		printArray(doubleArray); // Truyền vào mảng Double

		System.out.println("Array characterArray contains: ");
		printArray(charArray); // Truyền vào mảng Character
	}

	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
}
