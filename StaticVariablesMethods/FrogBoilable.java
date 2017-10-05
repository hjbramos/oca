interface FrogBoilable {
    static int getCtoF(int cTemp) {             // interface static method
        return (cTemp * 9 / 5) + 32;
    }
    
    default String hop() { return "hopping"; }  // interface default method
}