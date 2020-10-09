package entity;

import javafx.scene.image.Image;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Calendar;
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
    private int hours2;
    private int minutes;
    private int second;
    private long milisecond;
    private int firstUp;
    private int secondUp;
    private int thirdUp;

    private Image image;

    public Detail(String name, int type, int rarity, int collInFirstGr, int collInSecondGr, int collInThirdGr, String nameFile) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.collInFirstGr = collInFirstGr;
        this.collInSecondGr = collInSecondGr;
        this.collInThirdGr = collInThirdGr;
        String path = "src/image/" + nameFile + ".png";
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

    public Image getImage() {
        return image;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getFirstUp() {
        return firstUp;
    }

    public void setFirstUp(int firstUp) {
        this.firstUp = firstUp;
    }

    public int getSecondUp() {
        return secondUp;
    }

    public void setSecondUp(int secondUp) {
        this.secondUp = secondUp;
    }

    public int getThirdUp() {
        return thirdUp;
    }

    public void setThirdUp(int thirdUp) {
        this.thirdUp = thirdUp;
    }

    public long getMilisecond() {
        return milisecond;
    }

    public void setImage(String path) {
        File file = new File(path);
        try {
            image = new Image(file.toURI().toURL().toString(), false);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void setDate() {
        Calendar calendar = Calendar.getInstance();
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hours =  calendar.get(Calendar.HOUR_OF_DAY);
        hours2 = calendar.get(Calendar.HOUR);
        minutes = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        milisecond = calendar.get(Calendar.MILLISECOND);
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
                        "0." + hours2 + ";" +
                        "0." + minutes + ";" +
                        "0." + second + ";" +
                        "0." + firstUp + ";" +
                        "0." + secondUp + ";" +
                        "0." + thirdUp + ";";
    }
}
