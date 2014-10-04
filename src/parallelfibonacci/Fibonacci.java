/*
Fibonacci.java
Lindsay Simpkins
COMP 755
10/4/14

Is given n and an array.
Calculates the Fibonacci sequence from [0-n] (0 and n are inclusive)
Stores the sequence in the array.
 */

package parallelfibonacci;

public class Fibonacci implements Runnable{
    private int n;
    private int[] a;
    
    public Fibonacci(int n, int[] a){
        this.n = n;
        this.a = a;
    }
    
    public void run(){
            dynamicRecursiveFib(n);
    }
    
    private int dynamicRecursiveFib(int n){
        //base case
        if(n<=0){
            return 0;
        }
        //check if a value has already been calculated for n
        if(a[n]!=0){
            return a[n];
        }
        //calculate unknown value
        int tempFib = n;
        //if n >=2, do recursive calculation.
        if(n>1){
            tempFib = dynamicRecursiveFib(n-1) + dynamicRecursiveFib(n-2);
        }
        //Store tempFib in the array
        a[n] = tempFib;
        //return
        return tempFib;
        
    }
}
