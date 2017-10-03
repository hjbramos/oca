import java.util.ArrayList;

public class ImportMistake {
	public static void main(String[] args) {
//error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<String>
		ArrayList<String> a = new ArrayList<Integer>();
	}
}
