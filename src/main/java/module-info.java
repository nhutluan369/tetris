module com.example.newfxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;


    opens com.example.newfxproject to javafx.fxml;
    exports com.example.newfxproject;
}