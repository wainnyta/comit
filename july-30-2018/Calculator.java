public class Calculator {

    public final static int OK_CODE = 0;
    public final static int ERROR_CODE = 1;

    public int divide(int dividend,
                      int divider,
                      OperationCode operationCode) {
        int res = 0;
        operationCode.setValue(OK_CODE);

        if (divider != 0) {
            res = dividend / divider;
        } else {
            operationCode.setValue(ERROR_CODE);
        }

        return res;
    }

    public int divide(int dividend, int divider)
            throws ArithmeticException{

        if (divider == 0)
            throw new ArithmeticException();
        return dividend / divider;

    }
}
