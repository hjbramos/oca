public class InstantiateAbstractClassForbidden {
	public static void main(String [] args) {
		AbstractClass abstractClass = new AbstractClass();
		// error: AbstractClass is abstract; cannot be instantiated (compilation error)
	}
}
