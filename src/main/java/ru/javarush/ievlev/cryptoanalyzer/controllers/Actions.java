package ru.javarush.ievlev.cryptoanalyzer.controllers;
import ru.javarush.ievlev.cryptoanalyzer.commands.*;
import ru.javarush.ievlev.cryptoanalyzer.exeptions.AppException;

public enum Actions {
    ANALYSIS(new Analysis()),
    BRUTE_FORCE(new BruteForce()),
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }
    public static Action find (String actionName){
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            Action action = value.action;
            return action;
        } catch (IllegalArgumentException e) {
            throw new AppException("not found " + actionName, e);
        }
    }
}
