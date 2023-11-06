package HomeWork7.App;

import HomeWork7.Service.CalculableBuilder;
import HomeWork7.Service.CalculableFactory;
import HomeWork7.View.StartService;

public class Main {
    public static void main(String[] args) {

        CalculableFactory calculableFactory = new CalculableBuilder();
        StartService startService = new StartService(calculableFactory);
        startService.Start();

    }
}

