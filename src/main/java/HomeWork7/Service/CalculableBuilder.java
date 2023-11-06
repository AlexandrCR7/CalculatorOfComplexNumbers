package HomeWork7.Service;

public class CalculableBuilder implements CalculableFactory{

    @Override
    public Calculable create(int a1, int b1) {
        return new Calculate(a1, b1);
    }
}
