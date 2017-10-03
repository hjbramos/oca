public class Moo extends Zoo {
	public void useMyCoolMethod() {
		System.out.println("subclass says " + this.coolMethod());

		Zoo z = new Zoo();
		System.out.println("Zoo says " + this.coolMethod());
	}
}
