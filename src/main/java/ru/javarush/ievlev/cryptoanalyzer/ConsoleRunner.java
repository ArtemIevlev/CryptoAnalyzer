package ru.javarush.ievlev.cryptoanalyzer;

import ru.javarush.ievlev.cryptoanalyzer.entiti.Application;
import ru.javarush.ievlev.cryptoanalyzer.entiti.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Application application = new Application();
        Result result = application.run(args);
    }
}
