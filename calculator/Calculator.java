package calculator;

public final class Calculator implements Calculable {

    private double primaryArg;

    public Calculator(double primaryArg2) {
        this.primaryArg = primaryArg2;
    }

    @Override
    public Calculable sum(double arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(double arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public double getResult() {
        return primaryArg;
    }

    @Override
    public Calculable divide(double arg) {
        primaryArg /= arg;
        return this;
    }
}
