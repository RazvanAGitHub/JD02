package homework4.fibonacci;

public class FibonacciMain {
    public static void main(String[] args) {
        String number = "9";
        int n;
        try {
            n = convertStringToInteger(number);
            System.out.println("The calculation for Fibonacci sequence for number " + n + " is: " + calculateFibonacciSequence(n));
        } catch (MyBusinessCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculateFibonacciSequence(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calculateFibonacciSequence(n - 1) + calculateFibonacciSequence(n - 2);
        }
    }

    public static int convertStringToInteger(String number) throws MyBusinessCheckedException {
        int n;
        try {
            n = Integer.parseInt(number);

            if (n < 0) {
                throw new MyBusinessCheckedException("The number should be positive", ErrorCode.NEGATIVE_NUMBER);
            } else if (n > 1_000_000) {
                throw new MyBusinessCheckedException("The number should not be greater than 1_000_000", ErrorCode.GREATER_THAN_1000000_NUMBER);
            }

            if (n % 2 == 0) {
                throw new MyBusinessUncheckedException("The number should be an ODD number.");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("The parameter should be an odd number between 0 and 1_000_000");
        }
        return n;
    }
}
