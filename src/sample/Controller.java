package sample;

import entity.Detail;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

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
        assert FirstGr_first != null : "fx:id=\"FirstGr_first\" was not injected: check your FXML file 'sample.fxml'.";
        assert FirstUp != null : "fx:id=\"FirstUp\" was not injected: check your FXML file 'sample.fxml'.";
        assert FirstGr_second != null : "fx:id=\"FirstGr_second\" was not injected: check your FXML file 'sample.fxml'.";
        assert FirstGr_third != null : "fx:id=\"FirstGr_third\" was not injected: check your FXML file 'sample.fxml'.";
        assert SecondGr_first != null : "fx:id=\"SecondGr_first\" was not injected: check your FXML file 'sample.fxml'.";
        assert SecondUp != null : "fx:id=\"SecondUp\" was not injected: check your FXML file 'sample.fxml'.";
        assert SecondGr_second != null : "fx:id=\"SecondGr_second\" was not injected: check your FXML file 'sample.fxml'.";
        assert SecondGr_third != null : "fx:id=\"SecondGr_third\" was not injected: check your FXML file 'sample.fxml'.";
        assert ThirdGr_first != null : "fx:id=\"ThirdGr_first\" was not injected: check your FXML file 'sample.fxml'.";
        assert ThirdUp != null : "fx:id=\"ThirdUp\" was not injected: check your FXML file 'sample.fxml'.";
        assert ThirdGr_second != null : "fx:id=\"ThirdGr_second\" was not injected: check your FXML file 'sample.fxml'.";
        assert ThirdGr_third != null : "fx:id=\"ThirdGr_third\" was not injected: check your FXML file 'sample.fxml'.";
        assert ThirdGr_fourth != null : "fx:id=\"ThirdGr_fourth\" was not injected: check your FXML file 'sample.fxml'.";
        assert SecondGr_fourth != null : "fx:id=\"SecondGr_fourth\" was not injected: check your FXML file 'sample.fxml'.";
        assert FirstGr_fourth != null : "fx:id=\"FirstGr_fourth\" was not injected: check your FXML file 'sample.fxml'.";
        Detail blokchein = new Detail("blokchein", 2, 3, 3, 2, 3, "blokchein");
        details2.add(blokchein);
        Detail dalnoboi = new Detail("dalnoboi", 1, 1, 3, 3, 3, "dalnoboi");
        details1.add(dalnoboi);
        Detail goblin = new Detail("goblin", 2, 2, 3, 3, 3, "goblin");
        details2.add(goblin);
        Detail gonochnoe = new Detail("gonochnoe", 4, 1, 3, 3, 0, "gonochnoe");
        details4.add(gonochnoe);
        Detail grom = new Detail("grom", 2, 3, 3, 3, 3, "grom");
        details2.add(grom);
        Detail guslia = new Detail("guslia", 4, 3, 3, 3, 0, "guslia");
        details4.add(guslia);
        Detail guslia1 = new Detail("guslia", 4, 3, 3, 3, 0, "guslia");
        details4.add(guslia1);
        Detail kyvalda = new Detail("kyvalda", 2, 1, 3, 3, 3, "kyvalda");
        details2.add(kyvalda);
        Detail malish = new Detail("malish", 2, 1, 3, 3, 3, "malish");
        details2.add(malish);
        Detail masiv = new Detail("masiv", 4, 2, 3, 3, 0, "masiv");
        details4.add(masiv);
        Detail masiv1 = new Detail("masiv", 4, 2, 3, 3, 0, "masiv");
        details4.add(masiv1);
        Detail rapira = new Detail("rapira", 2, 1, 3, 3, 3, "rapira");
        details2.add(rapira);
        Detail razgon = new Detail("razgon", 3, 1, 3, 3, 0, "razgon");
        details3.add(razgon);
        Detail razgon1 = new Detail("razgon", 3, 1, 3, 3, 0, "razgon");
        details3.add(razgon1);
        Detail savracs = new Detail("savracs", 3, 2, 3, 3, 0, "savracs");
        details3.add(savracs);
        Detail scepiami = new Detail("scepiami", 4, 1, 3, 3, 0, "scepiami");
        details4.add(scepiami);
        Detail sinus = new Detail("sinus", 2, 2, 3, 3, 3, "sinus");
        details2.add(sinus);
        Detail sluhach = new Detail("sluhach", 3, 1, 3, 1, 0, "sluhach");
        details3.add(sluhach);
        Detail spectr = new Detail("spectr", 2, 3, 3, 3, 3, "spectr");
        details2.add(spectr);
        Detail terzatel = new Detail("terzatel", 2, 3, 3, 2, 0, "terzatel");
        details2.add(terzatel);
        Detail viverna = new Detail("viverna", 1, 1, 3, 3, 3, "viverna");
        details1.add(viverna);
        Detail zatochka = new Detail("zatochka", 4, 2, 3, 3, 0, "zatochka");
        details4.add(zatochka);
        Detail zatochka1 = new Detail("zatochka", 4, 2, 3, 3, 0, "zatochka");
        details4.add(zatochka1);
        detailList.add(details1);
        detailList.add(details2);
        detailList.add(details3);
        detailList.add(details4);
        cloneListAraay.addAll(detailList);
        complete.setOnAction(event -> {
            if (focusFlag) {
                if (detail != null) {
                    getCodeUp();
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
                focusFlag = false;
                //ожидание потери фокуса
            }
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
        selectedRadio = (RadioButton) SecondUp.getSelectedToggle();
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
        selectedRadio = (RadioButton) ThirdUp.getSelectedToggle();
        switch (selectedRadio.getId()) {
            case ("ThirdGr_first"): {
                detail.setSecondUp(1);
                break;
            }
            case ("ThirdGr_second"): {
                detail.setSecondUp(2);
                break;
            }
            case ("ThirdGr_third"): {
                detail.setSecondUp(3);
                break;
            }
            case ("ThirdGr_fourth"): {
                detail.setSecondUp(4);
                break;
            }
            default: {
                detail.setSecondUp(0);
            }
        }
    }
}
