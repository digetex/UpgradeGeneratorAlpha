package sample;

import entity.Detail;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Controller {

    private List<Detail> details1 = new ArrayList<>();
    private List<Detail> details2 = new ArrayList<>();
    private List<Detail> details3 = new ArrayList<>();
    private List<Detail> details4 = new ArrayList<>();
    private List<List<Detail>> detailList = new ArrayList<>();
    private List<Detail> cloneAraay = new ArrayList<>();
    private List<List<Detail>> cloneListAraay = new ArrayList<>();
    Detail detail;
    private boolean flag = false;
    private boolean focusFlag = false;
    private FileWriter writer;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView Image;

    @FXML
    private RadioButton FirstGr_first;

    @FXML
    private ToggleGroup FirstUp;

    @FXML
    private RadioButton FirstGr_second;

    @FXML
    private RadioButton FirstGr_third;

    @FXML
    private RadioButton SecondGr_first;

    @FXML
    private ToggleGroup SecondUp;

    @FXML
    private RadioButton SecondGr_second;

    @FXML
    private RadioButton SecondGr_third;

    @FXML
    private RadioButton ThirdGr_first;

    @FXML
    private ToggleGroup ThirdUp;

    @FXML
    private RadioButton ThirdGr_second;

    @FXML
    private RadioButton ThirdGr_third;

    @FXML
    private RadioButton ThirdGr_fourth;

    @FXML
    private RadioButton SecondGr_fourth;

    @FXML
    private RadioButton FirstGr_fourth;

    @FXML
    private TextField focus;

    @FXML
    private Button complete;

    @FXML
    private CheckBox check;

    @FXML
    void initialize() {
        List<String> firstUp = Arrays.asList("", "", "", "");
        List<String> secondUp = Arrays.asList("", "", "", "");
        List<String> thirdUp = Arrays.asList("", "", "", "");
        List<String> firstUp1 = Arrays.asList("Прочность +10%", "Масса -17%", "Устойчивость ко всему урону +10%", "");
        List<String> secondUp1 = Arrays.asList("Урон +5%", "Время перезарядки -9", "", "");
        List<String> thirdUp1 = Arrays.asList("Скорость поворота +10%", "Дальность стрельбы +15%", "Скорость сведения " +
                "прицела +15%", "");
        List<String> secondUp2 = Arrays.asList("Урон от самоничтожения +10%", "Радиус взрыва при уничтожении +10%",
                "Задержка перед самоуничтожением -20%", "");
        List<String> thirdUp2 = Arrays.asList("Мощность +20%", "Грузоподьемность кабины +10%", "Предельная масса +10%", "");
        List<String> secondUp3 = Arrays.asList("Грузоподьемность +10%", "штраф к мощносте меньше на 15%",
                "Сцепление с поверхностью +25%", "");
        List<String> secondUp4 = Arrays.asList("Урон +5%", "Время до перегрева +10%", "Скорость охлаждения +10%", "");
        List<String> thirdUp3 = Arrays.asList("Разброс -17%", "Дальность стрельбы +15%", "Скорость поворота +10%", "");
        List<String> secondUp5 = Arrays.asList("Урон +5%", "Радиус взрыва +10%", "Время перезарядки -9%", "");
        List<String> secondUp6 = Arrays.asList("Урон +5%", "Радиус взрыва +10%", "Время до перегрева +10%", "");
        List<String> thirdUp4 = Arrays.asList("Разброс -17%", "Скорость полета снарда + 25%",
                "Скорость поворота +10%", "");
        List<String> thirdUp5 = Arrays.asList("Увеличение разброса при выстреле ниже на 17%", "Отдача -20%",
                "Скорость поворота +10%", "");
        List<String> secondUp7 = Arrays.asList("Ускорение +10%", "Время до перегрева +10%", "Скорость охлаждения +10%",
                "");
        List<String> secondUp8 = Arrays.asList("Бонус к мощности +10%", "Предельная масса +3%", "Бонус к скорости +10%",
                "");
        List<String> secondUp9 = Arrays.asList("Урон +5%", "Время до перегрева", "Время до перегрева +10%", "");
        List<String> thirdUp6 = Arrays.asList("Увеличение разброса при выстреле ниже 17%", "Дальность стрельбы +15%",
                "Скорость сведения прицела +15%", "");
        List<String> secondUp10 = Arrays.asList("Радиус обнаружения +15%", "", "", "");
        List<String> secondUp11 = Arrays.asList("Контактный урон +5%", "Таранный урон +10%", "", "");
        Detail blokchein = new Detail("blokchein", 2, 3, 3,
                2, 3, "blokchein", firstUp1, secondUp1, thirdUp1);
        details2.add(blokchein);
        Detail dalnoboi = new Detail("dalnoboi", 1, 1, 3, 3,
                3, "dalnoboi", firstUp1, secondUp2, thirdUp2);
        details1.add(dalnoboi);
        Detail goblin = new Detail("goblin", 2, 2, 3, 3, 3, "goblin");
        Detail gonochnoe = new Detail("gonochnoe", 4, 1, 3,
                3, 0, "gonochnoe", firstUp1, secondUp3, thirdUp);
        details4.add(gonochnoe);
        Detail grom = new Detail("grom", 2, 3, 3, 3,
                3, "grom", firstUp1, secondUp4, thirdUp3);
        details2.add(grom);
        Detail guslia = new Detail("guslia", 4, 3, 3, 3,
                0, "guslia", firstUp1, secondUp3, thirdUp);
        details4.add(guslia);
        Detail guslia1 = new Detail("guslia", 4, 3, 3, 3,
                0, "guslia", firstUp1, secondUp3, thirdUp);
        details4.add(guslia1);
        Detail kyvalda = new Detail("kyvalda", 2, 1, 3, 3,
                3, "kyvalda", firstUp1, secondUp4, thirdUp3);
        details2.add(kyvalda);
        Detail malish = new Detail("malish", 2, 1, 3, 3,
                3, "malish", firstUp1, secondUp5, thirdUp4);
        details2.add(malish);
        Detail masiv = new Detail("masiv", 4, 2, 3, 3, 0,
                "masiv", firstUp1, secondUp3, thirdUp);
        details4.add(masiv);
        details4.add(masiv);
        Detail rapira = new Detail("rapira", 2, 1, 3, 3, 3,
                "rapira", firstUp1, secondUp6, thirdUp5);
        details2.add(rapira);
        Detail razgon = new Detail("razgon", 3, 1, 3, 3, 0,
                "razgon", secondUp1, secondUp7, thirdUp);
        details3.add(razgon);
        details3.add(razgon);
        Detail savracs = new Detail("savracs", 3, 2, 3, 3, 0,
                "savracs", firstUp1, secondUp8, thirdUp);
        details3.add(savracs);
        Detail scepiami = new Detail("scepiami", 4, 1, 3, 3, 0,
                "scepiami", firstUp1, secondUp3, thirdUp);
        details4.add(scepiami);
        Detail sinus = new Detail("sinus", 2, 2, 3, 3, 3,
                "sinus", firstUp1, secondUp9, thirdUp6);
        details2.add(sinus);
        Detail sluhach = new Detail("sluhach", 3, 1, 3, 1, 0,
                "sluhach", firstUp1, secondUp10, thirdUp);
        details3.add(sluhach);
        Detail spectr = new Detail("spectr", 2, 3, 3, 3, 3,
                "spectr", firstUp1, secondUp4, thirdUp6);
        details2.add(spectr);
        Detail terzatel = new Detail("terzatel", 2, 3, 3, 2, 0,
                "terzatel", firstUp1, secondUp11, thirdUp);
        details2.add(terzatel);
        Detail viverna = new Detail("viverna", 1, 1, 3, 3, 3,
                "viverna", firstUp1, secondUp2, thirdUp2);
        details1.add(viverna);
        Detail zatochka = new Detail("zatochka", 4, 2, 3, 3, 0,
                "zatochka", firstUp1, secondUp3, thirdUp);
        details4.add(zatochka);
        details4.add(zatochka);
        detailList.add(details1);
        detailList.add(details2);
        detailList.add(details3);
        detailList.add(details4);
        cloneListAraay.addAll(detailList);
        complete.setOnAction(event -> {
            if (detail != null && focusFlag) {
                getCodeUp();
                writeToFile();
            }
            if (cloneListAraay.isEmpty()) {
                cloneListAraay.addAll(detailList);
                flag = true;
            }
            Collections.shuffle(cloneListAraay);
            if (cloneAraay.isEmpty()) {
                cloneAraay.addAll(cloneListAraay.get(0));
                cloneListAraay.remove(0);
                if (flag) {
                    flag = false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Информация");
                    alert.setHeaderText(null);
                    alert.setContentText("Новый круг");
                    alert.showAndWait().ifPresent(rs -> {
                        if (rs == ButtonType.OK) {
                            System.out.println("Pressed OK.");
                        }
                    });
                }
            }
            Collections.shuffle(cloneAraay);
            detail = cloneAraay.get(0);
            cloneAraay.remove(0);
            Image.setImage(detail.getImage());
            disableGrid();
            focusFlag = false;
            //ожидание потери фокуса
        });
        focus.focusedProperty().addListener((obs, oldValue, newValue) -> {
            if (!newValue && check.isSelected()) {/* при потере */
                complete.requestFocus();
                check.setSelected(false);
                if (detail != null) {
                    detail.setDate();
                    focusFlag = true;
                }
            }
        });
    }

    private void getCodeUp() {
        RadioButton selectedRadio = (RadioButton) FirstUp.getSelectedToggle();
        if (selectedRadio != null && selectedRadio.getId() != null) {
            switch (selectedRadio.getId()) {
                case ("FirstGr_first"): {
                    detail.setFirstUp(1);
                    break;
                }
                case ("FirstGr_second"): {
                    detail.setFirstUp(2);
                    break;
                }
                case ("FirstGr_third"): {
                    detail.setFirstUp(3);
                    break;
                }
                case ("FirstGr_fourth"): {
                    detail.setFirstUp(4);
                    break;
                }
                default: {
                    detail.setFirstUp(0);
                }
            }
            selectedRadio.setSelected(false);
        } else {
            detail.setFirstUp(0);
        }
        selectedRadio = (RadioButton) SecondUp.getSelectedToggle();
        if (selectedRadio != null && selectedRadio.getId() != null) {
            switch (selectedRadio.getId()) {
                case ("SecondGr_first"): {
                    detail.setSecondUp(1);
                    break;
                }
                case ("SecondGr_second"): {
                    detail.setSecondUp(2);
                    break;
                }
                case ("SecondGr_third"): {
                    detail.setSecondUp(3);
                    break;
                }
                case ("SecondGr_fourth"): {
                    detail.setSecondUp(4);
                    break;
                }
                default: {
                    detail.setSecondUp(0);
                }
            }
            selectedRadio.setSelected(false);
        } else {
            detail.setSecondUp(0);
        }
        selectedRadio = (RadioButton) ThirdUp.getSelectedToggle();
        if (selectedRadio != null && selectedRadio.getId() != null) {
            switch (selectedRadio.getId()) {
                case ("ThirdGr_first"): {
                    detail.setThirdUp(1);
                    break;
                }
                case ("ThirdGr_second"): {
                    detail.setThirdUp(2);
                    break;
                }
                case ("ThirdGr_third"): {
                    detail.setThirdUp(3);
                    break;
                }
                case ("ThirdGr_fourth"): {
                    detail.setThirdUp(4);
                    break;
                }
                default: {
                    detail.setThirdUp(0);
                }
            }
            selectedRadio.setSelected(false);
        } else {
            detail.setThirdUp(0);
        }
    }

    private void writeToFile() {
        try {
            writer = new FileWriter("result.txt", true);
            writer.write(detail.toString());
            writer.append('\n');
            writer.close();
            if (detail.getMilisecond() > 150 && detail.getMilisecond() < 850) {
                writer = new FileWriter("result1.txt", true);
                writer.write(detail.toString());
                writer.append('\n');
                writer.close();
            }
            writer = new FileWriter("anotherResult.txt", true);
            writer.write(detail.anotherString());
            writer.append('\n');
            writer.close();
            if (detail.getMilisecond() > 150 && detail.getMilisecond() < 850) {
                writer = new FileWriter("anotherResult1.txt", true);
                writer.write(detail.anotherString());
                writer.append('\n');
                writer.close();
            }
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Информация");
            alert.setHeaderText(null);
            alert.setContentText("Ошибка записи");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        }

    }

    private void disableGrid() {
        activateAll();
        if (detail.getCollInFirstGr() < 4) {
            FirstGr_fourth.setDisable(true);
            if (detail.getCollInFirstGr() < 3) {
                FirstGr_third.setDisable(true);
                if (detail.getCollInFirstGr() < 2) {
                    FirstGr_second.setDisable(true);
                    if (detail.getCollInFirstGr() < 1) {
                        FirstGr_first.setDisable(true);
                    }
                }
            }
        }
        if (detail.getCollInSecondGr() < 4) {
            SecondGr_fourth.setDisable(true);
            if (detail.getCollInSecondGr() < 3) {
                SecondGr_third.setDisable(true);
                if (detail.getCollInSecondGr() < 2) {
                    SecondGr_second.setDisable(true);
                    if (detail.getCollInSecondGr() < 1) {
                        SecondGr_first.setDisable(true);
                    }
                }
            }
        }
        if (detail.getCollInThirdGr() < 4) {
            ThirdGr_fourth.setDisable(true);
            if (detail.getCollInThirdGr() < 3) {
                ThirdGr_third.setDisable(true);
                if (detail.getCollInThirdGr() < 2) {
                    ThirdGr_second.setDisable(true);
                    if (detail.getCollInThirdGr() < 1) {
                        ThirdGr_first.setDisable(true);
                    }
                }
            }
        }
        setName();
    }

    private void setName() {
        FirstGr_first.setText(detail.getFirstUpName().get(0));
        FirstGr_second.setText(detail.getFirstUpName().get(1));
        FirstGr_third.setText(detail.getFirstUpName().get(2));
        FirstGr_fourth.setText(detail.getFirstUpName().get(3));

        SecondGr_fourth.setText(detail.getSecondUpName().get(3));
        SecondGr_third.setText(detail.getSecondUpName().get(2));
        SecondGr_second.setText(detail.getSecondUpName().get(1));
        SecondGr_first.setText(detail.getSecondUpName().get(0));

        ThirdGr_fourth.setText(detail.getThirdUpName().get(3));
        ThirdGr_third.setText(detail.getThirdUpName().get(2));
        ThirdGr_second.setText(detail.getThirdUpName().get(1));
        ThirdGr_first.setText(detail.getThirdUpName().get(0));
    }

    private void activateAll() {
        FirstGr_fourth.setDisable(false);
        FirstGr_third.setDisable(false);
        FirstGr_second.setDisable(false);
        FirstGr_first.setDisable(false);
        SecondGr_fourth.setDisable(false);
        SecondGr_third.setDisable(false);
        SecondGr_second.setDisable(false);
        SecondGr_first.setDisable(false);
        ThirdGr_fourth.setDisable(false);
        ThirdGr_third.setDisable(false);
        ThirdGr_second.setDisable(false);
        ThirdGr_first.setDisable(false);
    }

}
