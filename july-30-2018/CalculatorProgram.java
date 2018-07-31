public class CalculatorProgram {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        OperationCode operationCode = new OperationCode();
//        int result = calculator.divide(
//                10, 2, operationCode);
//
//        if (operationCode.getValue() == Calculator.OK_CODE) {
//            System.out.println("Result is : " + result);
//        } else {
//            System.out.println("There has been some error!");
//        }

        try {
            int result = calculator.divide(2, 0);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Continue execution here...");
    }
}
