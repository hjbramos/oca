public class OverriddenMethodForbidden extends FinalMethod {
// error: getNumber() in OverriddenMethodForbidden cannot override getNumber() in FinalMethod (compilation error)
	public static void getNumber() {
		System.out.println(11);
	}

	public static void main(String[] args) {
		getNumber();
	}

}
