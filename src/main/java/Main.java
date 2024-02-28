import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        long sumStartTime = System.nanoTime();
        // I worked with Jake on the extra credit part of this one and he had the great suggestion to use System.nanoTime();!
        long sum = sumOfNumbers(number);
        long sumElapsed = System.nanoTime() - sumStartTime;
        System.out.println("Time elapsed: " + sumElapsed + "ns");

        long gaussStartTime = System.nanoTime();
        long gaussianSum = gaussianSumOfNumbers(number);
        long gaussElapsed = System.nanoTime() - gaussStartTime;
        System.out.println("Gaussian time: " + gaussElapsed + "ns");

        System.out.println("Sum: " + sum);
    }


    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static long sumOfNumbers(int n) {
        long temp = 0;
        for (int i = 0; i <= n; i++) {
            temp += i;
        }
        return temp;
    }

    static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static long gaussianSumOfNumbers(int n) {
        //gaussians sum equation is the result (n * (n +1)) / 2
        long sum = ((long) n * ((long) n + 1)) / 2;
        return sum;
    }

   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
