package entity;

import javafx.scene.image.Image;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

    private int firstFirstUp;
    private int secondFirstUp;
    private int thirdFirstUp;
    private int fourthFirstUp;

    private int firstSecondUp;
    private int secondSecondUp;
    private int thirdSecondUp;
    private int fourthSecondUp;

    private int firstThirdUp;
    private int secondThirdUp;
    private int thirdThirdUp;
    private int fourthThirdUp;

    private List<String> firstUpName;
    private List<String> secondUpName;
    private List<String> thirdUpName;

    private Image image;

    public Detail(String name, int type, int rarity, int collInFirstGr, int collInSecondGr, int collInThirdGr,
                  String nameFile) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.collInFirstGr = collInFirstGr;
        this.collInSecondGr = collInSecondGr;
        this.collInThirdGr = collInThirdGr;
        String path = "src/image/" + nameFile + ".png";
        setImage(path);
    }

    public Detail(String name, int type, int rarity, int collInFirstGr, int collInSecondGr, int collInThirdGr,
                  String nameFile, List<String> firstUpName, List<String> secondUpName, List<String> thirdUpName) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.collInFirstGr = collInFirstGr;
        this.collInSecondGr = collInSecondGr;
        this.collInThirdGr = collInThirdGr;
        String path = "src/image/" + nameFile + ".png";
        setImage(path);
        this.firstUpName = firstUpName;
        this.secondUpName = secondUpName;
        this.thirdUpName = thirdUpName;
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
        hours = calendar.get(Calendar.HOUR_OF_DAY);
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
                        "0." + milisecond + ";" +
                        "0." + firstUp + ";" +
                        "0." + secondUp + ";" +
                        "0." + thirdUp + ";";
    }

    public String anotherString() {
        switch (firstUp) {
            case (0): {
                firstFirstUp = 0;
                secondFirstUp = 0;
                thirdFirstUp = 0;
                fourthFirstUp = 0;
                break;
            }
            case (1): {
                firstFirstUp = 100;
                secondFirstUp = 0;
                thirdFirstUp = 0;
                fourthFirstUp = 0;
                break;
            }
            case (2): {
                firstFirstUp = 0;
                secondFirstUp = 100;
                thirdFirstUp = 0;
                fourthFirstUp = 0;
                break;
            }
            case (3): {
                firstFirstUp = 0;
                secondFirstUp = 0;
                thirdFirstUp = 100;
                fourthFirstUp = 0;
                break;
            }
            case (4): {
                firstFirstUp = 0;
                secondFirstUp = 0;
                thirdFirstUp = 0;
                fourthFirstUp = 100;
                break;
            }
        }
        switch (secondUp) {
            case (0): {
                firstSecondUp = 0;
                secondSecondUp = 0;
                thirdSecondUp = 0;
                fourthSecondUp = 0;
                break;
            }
            case (1): {
                firstSecondUp = 100;
                secondSecondUp = 0;
                thirdSecondUp = 0;
                fourthSecondUp = 0;
                break;
            }
            case (2): {
                firstSecondUp = 0;
                secondSecondUp = 100;
                thirdSecondUp = 0;
                fourthSecondUp = 0;
                break;
            }
            case (3): {
                firstSecondUp = 0;
                secondSecondUp = 0;
                thirdSecondUp = 100;
                fourthSecondUp = 0;
                break;
            }
            case (4): {
                firstSecondUp = 0;
                secondSecondUp = 0;
                thirdSecondUp = 0;
                fourthSecondUp = 100;
                break;
            }
        }
        switch (thirdUp) {
            case (0): {
                firstThirdUp = 0;
                secondThirdUp = 0;
                thirdThirdUp = 0;
                fourthThirdUp = 0;
                break;
            }
            case (1): {
                firstThirdUp = 100;
                secondThirdUp = 0;
                thirdThirdUp = 0;
                fourthThirdUp = 0;
                break;
            }

            case (2): {
                firstThirdUp = 0;
                secondThirdUp = 100;
                thirdThirdUp = 0;
                fourthThirdUp = 0;
                break;
            }

            case (3): {
                firstThirdUp = 0;
                secondThirdUp = 0;
                thirdThirdUp = 100;
                fourthThirdUp = 0;
                break;
            }

            case (4): {
                firstThirdUp = 0;
                secondThirdUp = 0;
                thirdThirdUp = 0;
                fourthThirdUp = 100;
                break;
            }

        }
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
                        "0." + milisecond + ";" +
                        "0." + firstFirstUp + ";" +
                        "0." + secondFirstUp + ";" +
                        "0." + thirdFirstUp + ";" +
                        "0." + fourthFirstUp + ";" +
                        "0." + firstSecondUp + ";" +
                        "0." + secondSecondUp + ";" +
                        "0." + thirdSecondUp + ";" +
                        "0." + fourthSecondUp + ";" +
                        "0." + firstThirdUp + ";" +
                        "0." + secondThirdUp + ";" +
                        "0." + thirdThirdUp + ";" +
                        "0." + fourthThirdUp + ";";
    }
}
