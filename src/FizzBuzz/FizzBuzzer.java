package FizzBuzz;

/**
 * Created by brandonteng on 12/11/14.
 */
public class FizzBuzzer {
    private static FizzBuzz fizzbuzz;

    public static void main(String[] args) {
        fizzbuzz = new FizzBuzz();
        for(int x = 1; x <= 100; x++) {
            System.out.println(fizzbuzz.evaluate(x));
        }
    }
}
