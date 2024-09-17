package ru.javarush.ievlev.cryptoanalyzer;

import ru.javarush.ievlev.cryptoanalyzer.entiti.Application;
import ru.javarush.ievlev.cryptoanalyzer.entiti.Result;
import ru.javarush.ievlev.cryptoanalyzer.exeptions.AppException;
import ru.javarush.ievlev.cryptoanalyzer.util.ArgsMaker;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {

        //encode text.txt encode.txt 12
        if (args.length == 0){
            args = ArgsMaker.doArgs();
        }
        Application application = new Application();
        Result result = application.run(args);
    }
}
