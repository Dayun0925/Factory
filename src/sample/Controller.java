package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    private Button show;
    @FXML
    private ComboBox meatChoice;
    @FXML
    private Label info;
    private String choice;
    @FXML
    private void initialize(){
        String[] choices ={"beef","chicken","pork"};

        meatChoice.getItems().addAll(choices);
        meatChoice.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {

                choice = newValue.toString();
                System.out.println(choice);

                info.setText(MeatFactory.getMeat(choice).showInformation());

            }
        });


    }


}
