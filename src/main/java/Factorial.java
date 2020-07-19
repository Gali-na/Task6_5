public class Factorial {
    public int getFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}
