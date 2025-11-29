module com.doculens {
    // We need these built-in JavaFX modules
    requires javafx.controls;
    requires javafx.fxml;
    
    // We need our external libraries
    requires com.jfoenix;
    requires org.apache.pdfbox;
    requires com.google.gson;
    requires java.desktop; // Needed specifically by PDFBox for font rendering

    // Allow JavaFX to access our code (to launch the app)
    opens com.doculens to javafx.fxml;
    exports com.doculens;
}