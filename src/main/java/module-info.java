module pl.jakub.porownywarka {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pl.jakub.porownywarka to javafx.fxml;
    exports pl.jakub.porownywarka;
}