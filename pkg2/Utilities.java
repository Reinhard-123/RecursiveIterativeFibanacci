
package project5.pkg2;


public class Utilities {
    
    
    public static int recursiveFib(int n) {
        
        if(n <= 2) {
            return 1;
        }
        
        return recursiveFib(n-1) + recursiveFib(n-2);
        
    }//recursiveFib
    
    
    
    public static long iterativeFib(int n) {
        
        long retVal;
        
        if(n <=2) {
            retVal = 1;
        }
        else {
            long olderVal = 1;
            long oldVal = 1;
            long newValue = 1;
  
            for(int i = 3; i <= n; i++) {
                newValue = oldVal + olderVal;
                olderVal = oldVal;
                oldVal = newValue;
            }
            retVal = newValue;
        }
        
        return retVal;
        
        
    }//iterativeFib
    
    
    
    
    
}//class
