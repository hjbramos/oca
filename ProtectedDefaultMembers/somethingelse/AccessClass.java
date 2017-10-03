package somethingelse;

import certification.OtherClass;

public class AccessClass {
  static public void main(String[] args) {
    OtherClass o = new OtherClass();
    o.testIt(); //error: testIt() is not public in OtherClass; cannot be accessed from outside package (compilation error)
  }
}
