package ru.javarush.ievlev.cryptoanalyzer.controllers;

import ru.javarush.ievlev.cryptoanalyzer.commands.Action;
import ru.javarush.ievlev.cryptoanalyzer.entiti.Result;

public class MainController {
    public Result doAction(String actionName, String[] parameters){
        Action action = Actions.find(actionName);
        Result execute = action.execute(parameters);
        return execute;
    }
}
