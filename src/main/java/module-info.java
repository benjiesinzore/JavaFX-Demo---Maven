module com.benjaminsinzore.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.benjaminsinzore.javafx to javafx.fxml;
    exports com.benjaminsinzore.javafx;
}