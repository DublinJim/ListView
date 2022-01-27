package com.example.listview;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Button addBtn;

    @FXML
    private TextField inputTxtFld;

    @FXML
    private ListView<String> listView;

    @FXML
    private Button removeBtn;

    @FXML
    void addAName(MouseEvent event) {
      listView.getItems().add(inputTxtFld.getText());
      inputTxtFld.setText("");


    }

    @FXML
    void removeAName(MouseEvent event) {
        int selected=listView.getSelectionModel().getSelectedIndex();

listView.getItems().remove(selected);


    }

}
