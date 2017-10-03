public interface DefineConstants {
	public int x = 1; // Looks non-static and non-final, but isn't
	int y = 1; // Looks default, non-static, non-final and non-public, but isn't
	static int a = 1; // Doesn't show final or public
	final int g = 1; // Doesn't show static or  public
	public static int z = 1; // Doesn't show final
	public final int b = 1; // Doesn't show static
	static final int c = 1; // Doesn't show public
	public static final int h = 1; // What you get implicity
}
