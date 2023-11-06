package HomeWork7.Service;

public class Calculate implements Calculable{
    int a1;
    int b1;

    public Calculate(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    @Override
    public String summComplex(int a2, int b2) {
        int firstPart = a1 + a2;
        int secondPart = b1 + b2;
        return firstPart + "+" + secondPart + "i";
    }

    @Override
    public String minusComplex(int a2, int b2) {
        int firstPart = a1 + a2;
        int secondPart = b1 + b2;
        return firstPart + "-" + secondPart + "i";
    }

    @Override
    public String multiplicationComplex(int a2, int b2) {
        int firstPart = (a1 * a2 - b1 * b2);
        int secondPart = (a1 * b2 + a2 * b1);
        return firstPart + "-" + secondPart + "i";
    }

    @Override
    public String divisionComplex(int a2, int b2) {
        int firstPart = (a1 * a2 - b1 * b2) / (a2 * a2 + b2 * b2);
        int secondPart = (a1 * b2 + a2 * b1) / (a2 * a2 + b2 * b2);
        return firstPart + "-" + secondPart + "i";
    }
}
