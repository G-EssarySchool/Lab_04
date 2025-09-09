public class Task1 {
    public static void main(String[] args) {
        int intOperandA = 28;
        int intOperandB = 7;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;
        double doubleOperandA = 56;
        double doubleOperandB = 14;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum of using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The difference of using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The product of using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The quotient of using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        System.out.println("The sum of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);
    }
}