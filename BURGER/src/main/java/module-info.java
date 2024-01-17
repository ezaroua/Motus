module fr.esgi.BURGUER {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;

    opens fr.esgi.burger to javafx.fxml;
    exports fr.esgi.burger;
}