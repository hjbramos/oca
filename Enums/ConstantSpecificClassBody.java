public class ConstantSpecificClassBody {
    BIG(8),
    HUGE(10),
    OVERWHELMING(16) {                  // start a code block that defines
                                        // the "body" for this constant
        
        public String getLidCode() {    // override the method
            return "A";                 // defined in CoffeeSize
        }
    };  // the semicolon is REQUIRED when more code follows
    
    private int ounces;
    
    public int getOunces() {
        return ounces;
    }
    
    public String getLidCode() {    // this method is overridden
                                    // by the OVERWHELMING constant
        return "B";                 // the default value we want to
                                    // return for CoffeeSize constants
    }
}