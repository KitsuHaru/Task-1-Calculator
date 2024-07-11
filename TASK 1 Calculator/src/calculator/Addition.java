package calculator;

public class Addition implements Operation {
    public double calculateResult(double left, double right){
        return left + right;
    }
    public double SubtractionResult(double left, double right){
        return left - right;
    }
    public double MultiplicationResult(double left, double right){
        return left * right;
    }
    public double DivisionResult(double left, double right){
        return left / right;
    }
}
