package ru.javarush.ievlev.cryptoanalyzer.commands;

import ru.javarush.ievlev.cryptoanalyzer.entiti.Result;

public interface Action {
    Result execute (String[] parameters);
}
