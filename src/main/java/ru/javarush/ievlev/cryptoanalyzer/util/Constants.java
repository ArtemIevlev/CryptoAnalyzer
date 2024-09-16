package ru.javarush.ievlev.cryptoanalyzer.util;

public class Constants {
    public static final String rus = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ";
    public static final String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String cypher = "0123456789";
    public static final String z = ",.?!/@#$%^&*()_-+={}[]";
    public static final String ALPHABET = rus + rus.toLowerCase() + eng + eng.toLowerCase() + cypher + z;
}
