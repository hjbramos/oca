public class SynchronizedMethod {
	public synchronized static void doStuff() {
		System.out.println("do stuff public synchronized.");
	}
	private synchronized static void doStuffPrivately() {
		System.out.println("do stuff privately synchronized.");
	}
	protected synchronized static void doStuffProtectively() {
		System.out.println("do stuff protectively synchronized");
	}
	
	public static void main(String[] args) {
			doStuff();
			doStuffPrivately();
			doStuffProtectively();
	}
}