package HomeWork7.View;

import HomeWork7.Service.*;

import java.util.Scanner;

public class StartService implements ViewStart, PrintComplex {

    private CalculableFactory calculableFactory;

    public StartService(CalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }


    @Override
    public void Start() {

        FileWriter fileWriter = new FileWriter();
        Scanner scannerComplex = new Scanner(System.in);
        System.out.println("Введите а1");
        int z1a1 = scannerComplex.nextInt();
        System.out.println("Введите b1");
        int z1b1 = scannerComplex.nextInt();
        Calculable calculate = calculableFactory.create(z1a1, z1b1);
        System.out.println("Выберете операцию (+, -, *, /)");
        String indication = scannerComplex.next();

        switch (indication) {
            case "+" -> {
                System.out.println("Введите a2");
                int z2a2 = scannerComplex.nextInt();
                System.out.println("Введите b2");
                int z2b2 = scannerComplex.nextInt();
                System.out.println("Ответ: ");
                printResult(calculate.summComplex(z2a2, z2b2));
                fileWriter.loggi(calculate.summComplex(z2a2, z2b2));
            }
            case "-" -> {
                System.out.println("Введите a2");
                int z2a2 = scannerComplex.nextInt();
                System.out.println("Введите b2");
                int z2b2 = scannerComplex.nextInt();
                System.out.println("Ответ: ");
                printResult(calculate.minusComplex(z2a2, z2b2));
                fileWriter.loggi(calculate.summComplex(z2a2, z2b2));
            }
            case "*" -> {
                System.out.println("Введите a2");
                int z2a2 = scannerComplex.nextInt();
                System.out.println("Введите b2");
                int z2b2 = scannerComplex.nextInt();
                System.out.println("Ответ: ");
                printResult(calculate.multiplicationComplex(z2a2, z2b2));
                fileWriter.loggi(calculate.summComplex(z2a2, z2b2));
            }
            case "/" -> {
                System.out.println("Введите a2");
                int z2a2 = scannerComplex.nextInt();
                System.out.println("Введите b2");
                int z2b2 = scannerComplex.nextInt();
                System.out.println("Ответ: ");
                printResult(calculate.divisionComplex(z2a2, z2b2));
                fileWriter.loggi(calculate.summComplex(z2a2, z2b2));
            }
        }
    }


    @Override
    public void printResult(String result) {
        System.out.printf(result);
    }

}
