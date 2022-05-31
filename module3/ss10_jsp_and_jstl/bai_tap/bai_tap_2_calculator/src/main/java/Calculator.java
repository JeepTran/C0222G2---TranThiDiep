public class Calculator {
    public static float calculate(float firstNum, float secondNum, char operand) {
        switch (operand) {
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            case '/':
                if (secondNum != 0)
                    return firstNum / secondNum;
                else
                    throw new RuntimeException("Cannot divide by 0!");
            default:
                throw new RuntimeException("Invalid operation!");
        }
    }
}
