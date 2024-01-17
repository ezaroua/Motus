module fr.esgi.motus {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.esgi.motus to javafx.fxml;
    exports fr.esgi.motus;
}