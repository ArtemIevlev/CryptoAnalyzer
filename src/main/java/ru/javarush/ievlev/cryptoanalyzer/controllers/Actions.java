package ru.javarush.ievlev.cryptoanalyzer.controllers;
import ru.javarush.ievlev.cryptoanalyzer.commands.Action;
import ru.javarush.ievlev.cryptoanalyzer.commands.Decoder;
import ru.javarush.ievlev.cryptoanalyzer.commands.Encoder;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }
    public static Action find (String actionName){
        Actions value = Actions.valueOf(actionName.toUpperCase());
        Action action = value.action;
        return action;
    }
}
