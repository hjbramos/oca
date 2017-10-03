import static java.lang.Integer.MAX_VALUE;
import static java.lang.Long.MAX_VALUE;

public class ImportStaticMaxValue {
	public static void main(String[] args) {
		System.out.println(MAX_VALUE);
		// error: reference to MAX_VALUE is ambiguous (compilation error)
	}
}
