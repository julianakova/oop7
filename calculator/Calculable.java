package calculator;

public interface Calculable {
    Calculable sum(double arg);
    Calculable multi(double arg);
    Calculable divide(double arg);
    double getResult();
}
