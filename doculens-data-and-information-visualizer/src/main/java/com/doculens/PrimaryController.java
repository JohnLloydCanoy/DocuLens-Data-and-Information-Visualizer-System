package com.doculens;
// Import necessary JavaFX and IO classes
// This is where we handle user interactions defined in the FXML file

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
