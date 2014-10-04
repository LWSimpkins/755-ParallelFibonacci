Given requirements: 
Input a number, n, from the command line. 
Create a thread to calculate the first n numbers in the Fibonacci sequence. The sequence starts at 0, so n is not inclusive.
The parent thread passes an array to the child thread, to store the Fibonacci numbers in. 
The parent thread waits for the child thread to complete, then prints out the generated sequence.