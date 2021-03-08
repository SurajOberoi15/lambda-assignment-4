// Write a lambda expression that accepts two long arguments as a range borders 
// and calculates (returns) production of all numbers in this range (inclusively). 

// (x, y) -> {
//     long result = 1;
//     for (long i = x; i <= y; i++) {
//         result *= i;
//     }
//     return result;
//  }

import java.util.Scanner;
import java.util.function.BiFunction;


public class lambdaborder {
    public static void main(String[] args){

        BiFunction<Long, Long,Long> f1 = (x, y) -> {
            long result = x;
            for(long i = x + 1; i <= y; i++){
                result *= i;
            };
            return result;
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long value");
        long value1 = sc.nextLong();
        long value2 = sc.nextLong();
        long productionOfNumbers = f1.apply(value1,value2);
        System.out.println(productionOfNumbers);
        sc.close();
    }
}

