public class Foo {
  public void doStuff(int fileNumber, final int recNumber) {
    fileNumber += 10;
    recNumber = 20; // error: final parameter recNumber may not be assigned (compilation error)
  }
}
