
package project5.pkg2;


public class Project52 {

    
    public static void main(String[] args) {
        
        System.out.println("x\tfib(x)\t     Recurive(ns)  Iterative(ns)\n"
                            + "=================================================");
        
        for(int i = 10; i <= 50; i += 10) {
            
            long start = System.nanoTime();
            long fib = Utilities.recursiveFib(i);
            long elapsedRecursive = System.nanoTime() - start;
            
            start = System.nanoTime();
            fib = Utilities.iterativeFib(i);
            long elapsedIterative = System.nanoTime() - start;
            
            System.out.printf("%-8d%-15d%-15d%-8d\n", i, fib, elapsedRecursive, elapsedIterative );
        }//for loop
        
        
        System.out.println("=================================================");
        
        
        
        
        
        
        
    }//main
    
}
