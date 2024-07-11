package DemoGeneric;

public class GenericClass<T> {
	private T bienKieuT;

	public void add(T t) {
		this.bienKieuT = t;
	}

	public T get() {
		return bienKieuT;
	}

	public static void main(String[] args) {
		GenericClass<Integer> integerGenericClass = new GenericClass<Integer>();
		GenericClass<String> stringGenericClass = new GenericClass<String>();

		integerGenericClass.add(new Integer(20));
		stringGenericClass.add(new String("Xin chào, Tôi là Lê Xuân Hiếu"));

		System.out.printf("Integer Value: %d\n\n", integerGenericClass.get());
		System.out.printf("String Value : %s\n", stringGenericClass.get());

	}
}
