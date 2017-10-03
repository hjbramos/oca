public class Gold extends Mineral {
    
    private String type = "Gold";
    
    Gold() {
        // Only static variables and methods can be accssed as part of the call to super() or this().
        super(Mineral.TYPE_GOLD);
        //super(this.type); // error: cannot reference this before supertype constructor has been called
        
        //You cannot make a call to an instance method or access an instance variable until after the super constructor runs.
    }
}