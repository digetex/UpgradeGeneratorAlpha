package entity;

import java.io.File;
import java.util.Date;

public class Detail {
    private String name;
    private int type;//1-кабина 2- оружие  3 модули 4 - колеса
    private int rarity; // 1- синька 2 бирюза 3 фиол 4 лега 5 реликт
    private int collInFirstGr;
    private int collInSecondGr;
    private int collInThirdGr;
    private int month;
    private int day;
    private int hours;
    private int minutes;
    private int second;
    private File image;

    public Detail(String name, int type, int rarity, int collInFirstGr, int collInSecondGr, int collInThirdGr, String nameFile) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.collInFirstGr = collInFirstGr;
        this.collInSecondGr = collInSecondGr;
        this.collInThirdGr = collInThirdGr;
        String path = "images/"+nameFile + ".png" ;
        setImage(path);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getCollInFirstGr() {
        return collInFirstGr;
    }

    public void setCollInFirstGr(int collInFirstGr) {
        this.collInFirstGr = collInFirstGr;
    }

    public int getCollInSecondGr() {
        return collInSecondGr;
    }

    public void setCollInSecondGr(int collInSecondGr) {
        this.collInSecondGr = collInSecondGr;
    }

    public int getCollInThirdGr() {
        return collInThirdGr;
    }

    public void setCollInThirdGr(int collInThirdGr) {
        this.collInThirdGr = collInThirdGr;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }

    public int getHours() {
        return hours;
    }

    public void setImage(String path) {
        image = new File(path);
    }

    public void setDate() {
        Date currentDate = new Date();
        month = currentDate.getMonth();
        day = currentDate.getDay();
        hours = currentDate.getDay();
        minutes = currentDate.getMinutes();
        second = currentDate.getSeconds();
    }

    @Override
    public String toString() {

        return
                "0." + type + ";" +
                        "0." + rarity + ";" +
                        "0." + collInFirstGr + ";" +
                        "0." + collInSecondGr + ";" +
                        "0." + collInThirdGr + ";" +
                        "0." + month + ";" +
                        "0." + day + ";" +
                        "0." + hours + ";" +
                        "0." + minutes + ";" +
                        "0." + second + ";";
    }
}
